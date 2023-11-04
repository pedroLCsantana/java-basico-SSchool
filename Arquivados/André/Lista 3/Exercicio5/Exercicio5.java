import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunte ao usuário o valor inicial da dívida
        System.out.print("Digite o valor inicial da dívida: ");
        double valorInicial = scanner.nextDouble();

        // Pergunte ao usuário a quantidade de meses
        System.out.print("Digite a quantidade de meses: ");
        int quantidadeMeses = scanner.nextInt();

        // Pergunte ao usuário os juros mensais em porcentagem
        System.out.print("Digite os juros mensais (em porcentagem): ");
        double jurosMensais = scanner.nextDouble();

        // Calcule o valor final da dívida com juros simples
        double juros = (valorInicial * jurosMensais / 100) * quantidadeMeses;
        double valorFinal = valorInicial + juros;

        // Exiba o valor final da dívida
        System.out.println("O valor final da dívida é: " + valorFinal);

        // Feche o scanner
        scanner.close();
    }
}