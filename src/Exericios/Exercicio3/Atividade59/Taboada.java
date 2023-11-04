package Exericios.Exercicio3.Atividade59;

import java.util.Scanner;

class Taboada
{
    public static void main(String[] args)
    {
        System.out.println("Algoritmo que Imprime a taboada:\n");
        Scanner read = new Scanner(System.in);

        System.out.println("-- Digite '0' para imprimir a Taboada Completa --\n");
        System.out.printf("Digite o numero da taboada desejada: ");
        int numTaboada = read.nextInt();
        
        
        if(numTaboada != 0){
            taboadaEspecifica(numTaboada);
        }else{
            taboadaCompleta();
        }


        
    }

    public static void taboadaCompleta()
    {
        for(int num1 = 1; num1 <= 10; num1++)
        {
            System.out.println("===============Taboada do número "+num1+"===============");
            for(int num2 = 1; num2 <=10; num2++)
            {
                System.out.println(num1 +" X "+ num2+" = "+(num1*num2));
            }

        }
    }

    public static void taboadaEspecifica(int numTaboada)
    {
        System.out.println("===============Taboada do número "+numTaboada+"===============");
        for(int num2 = 1; num2 <=10; num2++)
        {
            System.out.println(numTaboada +" X "+ num2+" = "+(numTaboada*num2));
        }
    }
}