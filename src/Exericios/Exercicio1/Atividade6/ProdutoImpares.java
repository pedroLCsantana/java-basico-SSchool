package Exericios.Exercicio1.Atividade6;

import java.util.*;

class ProdutosImpares
{
    public static void main(String[] args)
    {
        long produto = 1;
        List<Integer> impares = new ArrayList<Integer>();

        for(int i = 15; i <= 30; i++)
        {
            if(i%2 != 0)
            {
                produto *=i;
                impares.add(i);
            }
        }

        

        System.out.println("O produto dos valores impares de 15 a 30 é: ");
        String texto= "";

        int count = 0;
        for(int i: impares)
        {
            count++;
            if(count==1)
            {
                texto = String.valueOf(i);
            }
            else
            { 
                texto += " * " + String.valueOf(i);
            }
            
        }
        System.out.println(texto+"= "+produto);

    }
        

}
