package lista3;

import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		
		// 28. Coloque em ordem crescente três números quaisquer.
		// Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if((a < b) && (b < c)) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		if((a < b) && (c < b)) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		
		if((b < a) && (a < c)) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		
		if((b < a) && (c < a)) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		if((c < b) && (b < a)) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		if((c < b) && (a < b)) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		s.close();
	}

}
