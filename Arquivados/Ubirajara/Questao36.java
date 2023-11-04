package lista3;

import java.util.Scanner;

public class Questao36 {

	public static void main(String[] args) {
		// 36. Exiba todos os números ímpares existentes entre dois números informados pelo usuário.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int primeiroValor = s.nextInt();
		System.out.print("Digite o segundo valor: ");
		int segundoValor = s.nextInt();
		s.close();
		
		// caso o primeiro valor de digitado seja maior que o segundo
		if(primeiroValor > segundoValor ) {
			
			for(int i = primeiroValor; i >= segundoValor; i--) {
				if(i % 2 == 1) {
					System.out.println(i);
				}
			}
			
		}
		// caso o primeiro valor de digitado seja menor que o segundo
		else {
			for(int i = primeiroValor; i<=segundoValor; i++) {
				if(i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
		

	}

}
