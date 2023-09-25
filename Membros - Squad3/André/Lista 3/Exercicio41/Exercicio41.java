import java.util.Random;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");

        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            }
        }

        scanner.close();
    }
}