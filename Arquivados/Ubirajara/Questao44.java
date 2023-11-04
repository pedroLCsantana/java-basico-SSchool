package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Questao44 {

	public static void main(String[] args) {
		
		/* 44 Calcule a média aritmética de 500 valores fornecidos pelo usuário.
 			Modifique o problema anterior para que a quantidade de valores também seja fornecida pelo
			usuário.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de valores para ser calculada: ");
		int quantidade = s.nextInt();
		
		int[] valores = new int[quantidade];
		int soma = 0;
		for (int i=0; i<valores.length; i++) {
			System.out.printf("Digite o %d valor: ", i+1);
			valores[i] = s.nextInt();
			
			soma += valores[i];
		}
		
		double media = soma / quantidade;
		
		System.out.printf("Media aritmetica  = %.2f", media);
		s.close();
	}

}
