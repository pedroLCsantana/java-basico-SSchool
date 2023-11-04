package Exericios.Exercicio1.Atividade8;

import java.util.Scanner;
import java.lang.StringBuilder;

class DetectarPolindromos
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        System.out.printf("Digite uma palavra: ");
        String word = read.nextLine();

        String reversedWord = new StringBuilder(word).reverse().toString();

        if(reversedWord.toLowerCase().equals(word.toLowerCase())){
            System.out.println("A palavra "+word+" é um polindromo");
        }else{
            System.out.println("A palavra "+word+" NÃO é um polindromo");
        }

    }
}