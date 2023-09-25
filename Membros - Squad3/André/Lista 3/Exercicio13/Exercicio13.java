package Lista3;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("insira as notas do aluno:");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();

        float media = (nota1+nota2+nota3) / 3;

        System.out.println("Anota do aluno é " + media);
        
        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("O aluno está em recuperação e deverá fazer a prova final.");
            System.out.println("Insira a nota da prova final:");
            float notaFinal = scan.nextFloat();
            float mediaFinal = (nota1+nota2+nota3+notaFinal) / 4;

            System.out.println("A média final do aluno é: " + mediaFinal);

            if (mediaFinal >= 5) {
            System.out.println("O aluno está aprovado.");
            } else {
            System.out.println("O aluno está reprovado.");
            }
        }
        
        else {
            System.out.println("O aluno está reprovado.");
        }        
        
        scan.close();
    }
}