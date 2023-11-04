import java.util.Scanner;

public class Contabc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palvra :");

		String frase = scan.nextLine();

		System.out.println("Escreva a palava ou frase desejada: " + frase);

		int vog  = 0;
		int cons = 0;
		int esp  = 0;

		frase = frase.toLowerCase();

		for (int i = 0 ; i < frase.length(); i++) {
			char c = frase.charAt(i);

			if (c == 32){
				esp++;												
			}

			if (c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
					vog++;						
			}

			if (c >=  98 && c <= 100 ||
			   c >= 102 && c <= 104 ||
			   c >= 106 && c <= 110 ||
			   c >= 112 && c <= 116 ||
			   c >= 118 && c <= 122){
				cons++;
			}
							
		}
		System.out.println("Total de espaços: "+esp);
		System.out.println("Total de vogáis: "+vog);
		System.out.println("Total de consoantes: "+cons);

	}
}