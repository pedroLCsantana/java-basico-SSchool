package lista3;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {

		/*15. Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
		Além de falar se a data está ok, informe também o nome do mês.
		Dica: meses com 30 dias: abril, junho, setembro e novembro.
		16. Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("informe o mês: ");
		int mes = s.nextInt();
		
		System.out.print("informe o dia: ");
		int dia = s.nextInt();
		
		while(mes <=0 || mes > 12 || dia > 31 || dia <= 0) {
			System.out.println("Dados incorretos. Digite as informações novamente");
			System.out.print("informe o mês: ");
			mes = s.nextInt();
			
			System.out.print("informe o dia: ");
			dia = s.nextInt();
			s.close();
		}
		
		while(true) {
			if(mes == 4 || mes == 6 || mes == 7 || mes == 11) {
				while (dia == 31) {
					System.out.printf("o mes %d vai até o dia 30%n", mes);
					System.out.println("Digite uma data até o dia 30: ");
					dia = s.nextInt();
					s.close();
				}
				break;
			}
			
			if (mes == 2) {
				if (dia > 28) {
					System.out.printf("o mes %d vai até o dia 28%n", mes);
					System.out.println("Digite uma data até o dia 28: ");
					dia = s.nextInt();
				}
				break;
			}
			
	}
		System.out.printf("Você digitou a data: %d/%d%n", dia, mes);
		
		
		if(mes <= 3) {
			System.out.println("Nasceu no primeiro trimestre");
		}
		else if(mes <= 6) {
			System.out.println("Nasceu no segundo trimestre");
		}
		
		else if(mes <=9) {
			System.out.println("Nasceu no terceiro trimestre");
		}
		else {
			System.out.println("Nasceu no quarto trimestre");
		}
		
	}
		
}	
		
		
