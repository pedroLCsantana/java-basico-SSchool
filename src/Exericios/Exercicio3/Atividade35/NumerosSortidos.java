package Exericios.Exercicio3.Atividade35; /**
 * 35. Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que
    o usuário determine a faixa do sorteio.
 * 
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class NumerosSortidos
{
    public static void main(String[] args)
    {
        Random rNum = new Random();
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>(); 
        int qtNumeros;
        int ateNumero;

        System.out.println("Números aleatorios: \n");
        System.out.print("Escolha quantos números aleatorios você deseja: ");
        qtNumeros = read.nextInt();

        System.out.print("\nQual o alcance da aleatoriedade : de 0 até ");
        ateNumero = read.nextInt();

        for(int i = 0; i < qtNumeros; i++)
        {
            numeros.add(rNum.nextInt(ateNumero));
        }

        System.out.println("\nSeus números aleatorios: ");
        for(Integer i: numeros)
        {
            System.out.print(" -" +i+ "-");
        }
    }
}

