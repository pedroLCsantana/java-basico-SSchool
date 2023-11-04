package lista3;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		
		/*Faça a verificação da validade de uma data completa (dia, mês e ano).
		Obs. um ano é bissexto, cujo mês de fevereiro possui 29 dias, se o resto da divisão do ano
		por 4 e também por 100 for zero, ou ainda se o resto da divisão por 400 for zero. Os meses
		com 30 dias são 4, 6, 9 e 11, os demais tem 31 dias.
		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		int ano = s.nextInt();
		
		    if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
		    	System.out.println("é bissexto");
		    }
		    else {
		    	System.out.println("não é bissexto");
		    }
		    s.close();
		}
}


