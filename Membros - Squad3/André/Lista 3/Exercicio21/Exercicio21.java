import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        double percentagemDiretoria = 0.30;
        double percentagemGerencia = 0.25;
        double percentagemOperacional = 0.20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o cargo do funcionário (Diretoria/Gerencia/Operacional): ");
        String cargo = scanner.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double valorEmprestimo = 0.0;

        if (cargo.equalsIgnoreCase("Diretoria")) {
            valorEmprestimo = salario * percentagemDiretoria;
        } else if (cargo.equalsIgnoreCase("Gerencia")) {
            valorEmprestimo = salario * percentagemGerencia;
        } else if (cargo.equalsIgnoreCase("Operacional")) {
            valorEmprestimo = salario * percentagemOperacional;
        } else {
            System.out.println("Cargo inválido");
        }

        System.out.println("O valor de empréstimo liberado para o funcionário é de R$" + valorEmprestimo);
        scanner.close();
    }
}