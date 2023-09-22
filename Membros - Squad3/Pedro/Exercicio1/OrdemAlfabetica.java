import java.util.Scanner;
import java.util.Arrays;

class OrdemAlfabetica
{
    public static void main(String[] args)
    {
        System.out.println("Algoritimo de Comparação de palavras");

        Scanner read = new Scanner(System.in);
        String word1;
        String word2;

        System.out.printf("Digite uma palavra: ");
        word1 = read.nextLine();
        System.out.printf("Digite uma segunda palavra: ");
        word2 = read.nextLine();

        String[] listWord = {word1, word2};
        
        Arrays.sort(listWord);
        
        for(String w :listWord){
            System.out.println(w);
        }

        if(listWord[0].compareTo(listWord[1]) == 0)
        {
            System.out.println("As palavras são iquais");  
        }
        else if( (listWord[0].compareTo(listWord[1]) != 0) && (listWord[0].length() == listWord[1].length()) )
        {
            System.out.println("São palavras diferente, mas com quantidades de letras iquais");
        }
        else if(listWord[0].length() > listWord[1].length())
        {
            System.out.println("'"+listWord[0]+ "' tem mais letras do que '"+ listWord[1]+"'");
        }
        else
        {
            System.out.println("'"+listWord[1]+ "' tem mais letras do que '"+ listWord[0]+"'");
        }

        


    }
}