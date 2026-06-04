import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        // Cria um leitor para entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Realiza a operação de soma
        int resultado = numero1 + numero2;

        System.out.println("A soma é: " + resultado);

        scanner.close(); // Fecha o scanner
    }
}