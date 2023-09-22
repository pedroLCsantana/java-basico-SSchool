package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	/* 4. Determine e exiba a média aritmética de um aluno a partir de suas 4 notas. */
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
			
		double[] listaNotas = new double[4];
		double soma = 0.0;
		
		for(int i = 0; i < listaNotas.length; i++) {
			System.out.printf("Digite a nota %d: ", i+1);
			listaNotas[i] = s.nextDouble();
			soma += listaNotas[i];
		}
		
		System.out.printf("A média do aluno é: %.1f", soma / listaNotas.length);
		
		
		

		s.close();
	}
}
