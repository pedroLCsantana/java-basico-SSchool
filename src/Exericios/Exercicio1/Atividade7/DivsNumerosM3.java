package Exericios.Exercicio1.Atividade7;

import java.util.Scanner;

class DivsNumerosM3
{
    public static void main(String[] args)
    {
        final int DIV_VALUE= 2;
        final int MULT_VALUE= 3;
        final int MAX_VALUE= 100;

        System.out.println("Esse algoritmo mostra a divisão por "+DIV_VALUE+" de todos os Multiplos de "+MULT_VALUE+" (Até "+MAX_VALUE+"):");

        for(double i = 1; i <= 100; i++)
        {
            if(i%MULT_VALUE == 0)
            {
                System.out.println(i+" / "+DIV_VALUE+ " = "+ (i/DIV_VALUE));
            }
        }
    }
}