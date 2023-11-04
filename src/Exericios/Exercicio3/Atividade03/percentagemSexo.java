package Exericios.Exercicio3.Atividade03; /**
 * 3. Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
 *  calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.
 * 
 */

import java.util.Scanner;

class percentagemSexo
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int countMens;
        int countWomens;
        int totalPersons;
        double percentageMens;
        double percentageWomens;

        System.out.println("Quantos Homens tem na sala?");
        countMens= read.nextInt();

        System.out.println("Quantos Mulheres tem na sala?");
        countWomens= read.nextInt();

        totalPersons = countMens+countWomens;

        percentageMens = ((double) countMens/totalPersons)*100;
        percentageWomens = ((double) countWomens/totalPersons)*100;

        System.out.println(percentageMens+"%");
        System.out.println(percentageWomens+"%");

    }
}