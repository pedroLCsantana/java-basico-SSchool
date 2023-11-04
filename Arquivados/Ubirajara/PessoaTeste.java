package lista3;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o nome da primeira pessoa: ");
		p1.nome = s.nextLine();
		System.out.print("Digite a idade da primeira pessoa: ");
		p1.idade = s.nextInt();
		
		s.nextLine();
		
		System.out.print("Digite o nome da segunda pessoa: ");
		p2.nome = s.nextLine();
		System.out.print("Digite a idade da segunda pessoa: ");
		p2.idade = s.nextInt();
		
		
		if(p1.idade > p2.idade) {
			System.out.println("pessoa mais velha: " + p1.nome);
			System.out.println("pessoa mais nova: " + p2.nome);
		}
		else {
			System.out.println("pessoa mais velha: " + p2.nome);
			System.out.println("pessoa mais nova: " + p1.nome);
		}
		s.close();
		
	}
	

}
