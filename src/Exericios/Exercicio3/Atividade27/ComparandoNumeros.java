package Exericios.Exercicio3.Atividade27;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


class ComparandoNumeros
{
    private static Scanner  read;
    private static ArrayList<Integer> nums;
    private static Integer maior;
    

    public static void main(String[] args)
    {
        initingVars();

        adding_Nums();

        Collections.sort(nums);

        printResult();

    }

    public static void initingVars() // Iniciação
    {
        read = new Scanner(System.in);
        nums = new ArrayList<Integer>();
    }

    public static void adding_Nums() // Solicitação
    {
        System.out.println("Digite o primeiro numero: ");
        nums.add(read.nextInt());

        System.out.println("Digite o segundo numero: ");
        nums.add(read.nextInt());

        System.out.println("Digite o terceito numero: ");
        nums.add(read.nextInt());
    }

    public static void printResult() // Se tem iquais e qual é o maior numero
    {
        
        // Qual? Quantos?
        int last = nums.size()-1;
        maior = nums.get(last);
        int count = 0;

        for(int i = last-1; i>=0; i--)
        {
            if(nums.get(i) != maior){
                i=(-1); // Sair
            }else{
                count++;
            }
        }

        
        // Imprimir o(s) maior(es)
        if((count+1) == nums.size())
        {
            System.out.println("Todos os numeros são iquais! Valor: '"+maior+"'");

        }else if(count != 0){
            System.out.println("Os "+(count+1)+" maiores numeros possuem o valor '"+maior+"'");

        }else{
            System.out.println("O maior numero é: '"+maior+"'");
        }

        
    }

}