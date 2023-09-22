package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
	
		/*
		Transforme um número Racional (formado por numerador e denominador) para um número
		Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
		mensagem de alerta ao usuário se for zero.
		 */
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		System.out.print("Numerador: ");
		double numerador = s.nextDouble();
		
		System.out.print("Denominador: ");
		double denominador = s.nextDouble();
		
		if (denominador == 0) {
			System.out.println("O denominador não pode ser igual a zero!");
		}
		else {
			System.out.println(numerador / denominador);
		}
		
		
		
		s.close();
		

	}

}
