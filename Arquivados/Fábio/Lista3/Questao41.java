import java.util.Scanner;

public class Questao41 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int x = 0;
	int randon = (int) (1 + Math.random() * (100 - 1));
	int i = 0;

	System.out.println(randon);

		while (x != randon) {

			if (i == 0) {
				i++;
				System.out.println("Informe um número de 1 á 100:");
				x = sc.nextInt();
			}

			if (x < randon) {
				System.out.println("Número sorteado é maior que " + x);
				System.out.println("Informe outro número:");
				x = sc.nextInt();

			} else if (x > randon) {
				System.out.println("Número sorteado é menor que " + x);
				System.out.println("Informe outro número:");
				x = sc.nextInt();

			} 
		}
		sc.close();
		System.out.println("Acertou!");
	}
}