import java.util.Scanner;

public class Questao21 {
	public static void main(String[] args) {
	

	 Scanner ler = new Scanner(System.in);
			
	 	
	 	System.out.println();
	 	System.out.println("*** DIGITE O NÚMERO REFERENTE AO CARGO ***");
	 	System.out.println("1 - Diretor");
	 	System.out.println("2 - Gerente");
	 	System.out.println("3 - Operador");

	 	int	cod = ler.nextInt();

	  	System.out.println();
	 	
	 	switch (cod){

	 	case 1: System.out.println("Limite de empréstimo de 30%"); break;

	 	case 2: System.out.println("Limite de empréstimo de 25%"); break;

	 	case 3: System.out.println("Limite de empréstimo de 20%"); break;
		
	 	}
		ler.close();
	}
}