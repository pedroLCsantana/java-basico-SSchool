import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }

        scanner.close();

        System.out.println("O maior valor digitado é: " + maiorValor);
    }
}