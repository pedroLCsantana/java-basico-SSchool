/**
 * 39. Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio
    número) é igual a ele mesmo.
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;

class NumeroPerfeito
{
    public static void main(String[] args)
    {
        ArrayList<Integer> divisores = new ArrayList<Integer>();
        Scanner read = new Scanner(System.in);
        int num;

        System.out.println("Será que o número é perfeito? (Quando a soma dos seus divisores, exceto o próprio número, é igual a ele mesmo.) \n");
        System.out.print("Digito um número: ");
        num = read.nextInt();

        for(int i = 1; i <= num; i++)
        {
            if(num%i == 0 && num != i)
            {
                divisores.add(i);
            }
        }

        int sum = 0;
        for(Integer i: divisores)
        {
            sum+=i;
        }

        if(sum == num){
            System.out.println(num+" é um número perfeito!");        
        }else{
            System.out.println(num+" NÃO é um número perfeito!");
        }
    }
}