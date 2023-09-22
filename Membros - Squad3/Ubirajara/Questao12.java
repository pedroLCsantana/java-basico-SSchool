package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		/*
		12. A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
		recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação é
		>= 5.0 <=; 7.0; e a média do reprovado é < 5.0
		 */
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double [] listaNotas = new double[3];
		double soma = 0.0;
		double media = 0.0;
		
		for (int i=0; i < listaNotas.length; i++) {
			System.out.printf("Digite a %d nota: ", i+1);
			listaNotas[i] = s.nextDouble();
			
			soma += listaNotas[i];
		}
		
		media = soma / listaNotas.length;
		
		if(media >= 7.0) {
			System.out.printf("Sua média foi %.1f. Aluno aprovado!" ,media );
		}
		else if(media >= 5) {
			System.out.printf("Sua média foi %.1f. Aluno em recuperação!", media);
		}
		
		else {
			System.out.printf("Sua média foi %.1f. Aluno reprovado!", media);
		}
		
		s.close();
	}

}
