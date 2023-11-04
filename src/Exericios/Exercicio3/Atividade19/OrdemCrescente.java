package Exericios.Exercicio3.Atividade19;

import java.util.Scanner;
import java.util.Arrays;

class OrdemCrescente
{
    public static void main(String[] args)
    {  
        System.out.println("Algoritmo que ordena dois numeros em ordem crescente: \n"); 
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = read.nextInt();
        System.out.println("Digite um outro número inteiro");
        int num2 = read.nextInt();

        int[] listNums = {num1, num2};

        Arrays.sort(listNums);

        System.out.println("\nOrdem crescente: ");
        for(int i: listNums)
        {
            System.out.println(i);
        }
    }
}