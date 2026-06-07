package lpa;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {

		inicio();
	}

	// função principal para iniciar o sistema ->CLARA<-
	public static void inicio() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de posições do array:");
		int tamanho = teclado.nextInt();
		teclado.nextLine();

		// criei o array
		String palavras[] = new String[tamanho];

		// variavel da opcao escolhida
		int opcao;

		// esse é o do para puxar a função menu
		do {
			menu();
			opcao = teclado.nextInt();
			teclado.nextLine();

			switch (opcao) {

			// funçao de nico
			case 1:
				adicionarPalavra(palavras);
				break;

			// enzo
			case 2:
				alterarPalavra(palavras);
				break;

			// thauan
			case 3:
				excluirPalavra(palavras);
				break;

			// manu
			case 4:
				listarPalavra(palavras);
				break;

			// funçao para encerrar o sistema
			case 5:
				System.out.println("");
				System.out.println("Sistema encerrado");
				break;

			// essa bosta aq é para caso escolham um número que não puxe nenhuma função
			default:
				System.out.println("");
				System.out.println("Opção inválida");

			}
		} while (opcao != 5);

	}

	// função para mostrar o menu
	public static void menu() {

		System.out.println("");
		System.out.println("    MENU    ");
		System.out.println("1 - Adicionar palavra");
		System.out.println("2 - Alterar palavra");
		System.out.println("3 - Excluir palavra");
		System.out.println("4 - Listar palavras");
		System.out.println("5 - Sair");
		System.out.println("Escolha uma opção");
		System.out.println("");

	}

	// INICIO DO CODIGO DAS FUNÇÕES (OBS: cada um pfvr edite apenas dentro da sua
	// função)
	// FUNÇÃO DE NICO
	public static void adicionarPalavra(String[] vetor) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a palavra que deseja adicionar: ");
		String novaPalavra = input.nextLine();

		// 1 verificar se a palavra ja existe no array
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && vetor[i].equalsIgnoreCase(novaPalavra)) {
				System.out.println("Palavra existente");
				return;
			}
		}
		// 2 procurar uma posição vazia (null)
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = novaPalavra;
				System.out.println("Palavra adicionada na posição " + i);
				return;
			}
		}
		// 3 se nao saiu nos returns acima, o array esta cheio
		System.out.println("Não é possível adicionar item, todas as pocições estão preenchidas");
	}

	// FUNÇÃO DE ENZO
	public static void alterarPalavra(String[] palavras) {

		// abertura da entrada de dados e declarando variavel
		Scanner scan = new Scanner(System.in);

		String palavraAntiga = null;
		boolean palavraEncontrada = false;
		boolean palavraExiste = false;

		// pedindo a palavra antiga

		// while para continuar pedindo a palavra antiga se ela não for encontrada
		while (palavraEncontrada == false) {
			System.out.println("Qual a palavra você deseja alterar: ");
			palavraAntiga = scan.nextLine();

			// verificando se a palavra antiga existe
			for (int p = 0; p < palavras.length; p++) {
				if (palavras[p] != null && palavras[p].equals(palavraAntiga)) {

					palavraEncontrada = true;
					break;
				}
			}

			// se a palavra antiga não existir
			if (palavraEncontrada == false) {
				System.out.println("A palavra que você deseja alterar não foi encontrada");
			}
		}

		// pedindo a palavra nova
		System.out.println("Qual a palavra que você deseja colocar");
		String palavraNova = scan.nextLine();

		// se a palavra nova já existir
		for (int p = 0; p < palavras.length; p++) {
			if (palavras[p] != null && palavras[p].equals(palavraNova)) {
				palavraExiste = true;
				break;
			}
		}

		if (palavraExiste == true) {
			System.out.println("Essa palavra já existe");
			return;
		}

		// Se a palavra antiga existe e a palavra nova não existe, fazer a alteração
		for (int p = 0; p < palavras.length; p++) {
			if (palavras[p] != null && palavras[p].equals(palavraAntiga)) {
				palavras[p] = palavraNova;

				palavraEncontrada = true;

				if (palavraEncontrada == true) {
					System.out.println("Palavra alterada");
					return;
				}
			}
		}

	}

	// FUNÇÃO DE THAUAN
	public static void excluirPalavra(String[] palavras) {

	}

	// FUNÇÃO DE MANU
	public static void listarPalavra(String[] palavras) {

	}
}
