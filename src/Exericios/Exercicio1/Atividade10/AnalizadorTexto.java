package Exericios.Exercicio1.Atividade10;

import java.util.Scanner;

class AnalizadorTexto
{
    public static void main(String[] args)
    {
        System.out.println("Algoritmo que informa quantas Vagais, Consoantes e Espaços seu texto tem.");

        Scanner read = new Scanner(System.in);
        String text;
        char[] wordLatters;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int countVogais = 0;
        int countConsoante= 0;
        int countEspacos = 0;

        System.out.printf("Digite seu texto: ");
        wordLatters = read.nextLine().toCharArray();

        for(char l : wordLatters)
        {
            if(l == ' ')
            {
                countEspacos++;
            }
            else
            {
                boolean finded = false;
                for(char v : vogais)
                {
                    if(!finded){
                        if(v == l)
                        {
                            finded = true;
                            countVogais++;
                        }
                        else if(v == vogais[vogais.length-1])
                        {
                            countConsoante++;
                        }
                    }
                    
                }
            }
        }




        System.out.println("Seu texto tem: ");
        System.out.println(countVogais+" vogals");
        System.out.println(countConsoante+" consoantes");
        System.out.println(countEspacos+" espaços");




    }
}