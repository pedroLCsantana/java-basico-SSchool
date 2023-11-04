package Exericios.Exercicio3.Atividade43; /**
 * 
 * 43. Calcule a média aritmética de 500 valores fornecidos pelo usuário.
 * 
 */

import java.util.Scanner;

class media500
{
    public static void main(String[] args)
    {
        final int QUANTIDADES = 500;
        Scanner read = new Scanner(System.in);
        int num;
        int sum = 0;
        


        for(int i = 1; i <= QUANTIDADES; i++)
        {
            System.out.println("Informe o "+i+"º número");
            num = read.nextInt();
            sum += num;
        }
        System.out.println("A média dos números informados é iqual a: "+ sum/QUANTIDADES);
        
    }
}