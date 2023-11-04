package lista3;

import java.util.Scanner;

public class Questao48 {

	public static void main(String[] args) {
		/*
		 * 	Descida se um aluno será aprovado, reprovado por nota ou reprovado por faltas. Use o 
			sistema de avaliação da FAESA. Pergunte ao usuário a quantidade de notas para cálculo 
			da média semestral, sendo que todas elas possuem o mesmo peso.
		*/
		
		Scanner s = new Scanner(System.in);
		
		final int TOTAL_AULAS_SEMESTRE = 50;
				
		System.out.print("Digite a frequencia do aluno: ");
		int frequencia = s.nextInt();
		double percentualFrequencia = (double)frequencia / TOTAL_AULAS_SEMESTRE;
		
		System.out.print("Digite a média semestral do aluno: ");
		double mediaSemestral = s.nextDouble();
		
		if(percentualFrequencia < 0.75 || mediaSemestral < 7.0) {
			System.out.println("Aluno reprovado!");
		}
		
		else if(percentualFrequencia >= 0.75 && mediaSemestral >= 7.0) {
			System.out.println("Aluno aprovado!");
		}
		
		s.close();
	

		
		
		

	}

}
