package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Questao40 {

	public static void main(String[] args) {
		/*40. Solicite ao usuário a idade de cada um componente de um grupo de pessoas. A quantidade
			de pessoas também será determinada por ele.
			Após o término da entrada, apresente:
			a. a média das idades,
			b. a maior idade,
			c. a menor idade,
			d. a quantidade de pessoas maior de idade.
		*/
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de usuários: ");
		int qtdeUsuario = s.nextInt();
		int [] listaUsuario = new int[qtdeUsuario];
		int somaIdade = 0;
		int deMaior = 0;
		
		for(int i=0; i < listaUsuario.length; i++) {
			System.out.printf("Digite a idade do usuario %d: ", i+1);
			listaUsuario[i] = s.nextInt();
			somaIdade += listaUsuario[i];
			
			if(listaUsuario[i] >= 18) {
				deMaior += 1;
			}
		}
		
		double media = somaIdade / listaUsuario.length;
		System.out.printf("MEDIA: %.2f%n", media);
		
		int maior = 0;
		int menor = 0;
		
		for (int i=0; i<listaUsuario.length; i++) {

			if (i == 0) {
				maior = listaUsuario[i];
				menor = listaUsuario[i];
			}
			else {
				if (listaUsuario[i] > maior) {
					maior = listaUsuario[i];
				}
				
				if(listaUsuario[i] < menor) {
					menor = listaUsuario[i];
				}
			}
		}
		
		System.out.println("MAIOR idade: " + maior);
		System.out.println("MENOR idade: " + menor);
		System.out.println("Quantidade de pessoas maior de idade: " + deMaior);
		
		
		
		s.close();

	}

}
