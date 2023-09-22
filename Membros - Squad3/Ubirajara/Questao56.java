package lista3;

import java.util.Scanner;

public class Questao56 {

	public static void main(String[] args) {
		/*
		 * 56.Crie um programa para simular uma urna de votação para exatamente 3 candidatos. Logo 
			no início deve-se perguntar ao usuário os nomes dos candidatos. Permita votos em branco. 
			Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de 
			cada candidato. Apresente também a quantidade e o percentual dos votos em branco e 
			quem foi o ganhador da eleição.
		*/
		
		int quantidadeVotosJose = 0;
		int quantidadeVotosMaria = 0;
		int quantidadeVotosZezinho = 0;
		int quantidadeVotosBrancos = 0;
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Escolha o candidato: ");
		int escolha = s.nextInt();
		int total = 0;
		
		while(escolha != -1) {
		
			if (escolha == 1) {
				quantidadeVotosMaria ++;
			}
			else if(escolha == 2) {
				quantidadeVotosJose++;
			}
			else if(escolha == 3){
				quantidadeVotosZezinho++;
			}
			
			else {
				quantidadeVotosBrancos++;
			}
			System.out.print("Escolha o candidato: ");
			escolha = s.nextInt();
			total += 1;
		}
		
		double percentualMaria = quantidadeVotosMaria * 100 / total;
		double percentualJose = quantidadeVotosJose * 100 / total;
		double percentualZezinho = quantidadeVotosZezinho * 100 / total;
		double percentualBranco = quantidadeVotosBrancos * 100 / total;
		
		System.out.println("VOTOS VALIDOS: " + total);
		System.out.printf("VOTOS CANDIDATO(A) MARIA: " + quantidadeVotosMaria + percentualMaria, " por cento dos votos válidos");
		System.out.printf("VOTOS CANDIDATO(A) JOSÉ: " + quantidadeVotosJose + percentualJose, "por cento dos votos válidos");
		System.out.printf("VOTOS CANDIDATO(A) ZEZINHO: " + quantidadeVotosZezinho + percentualZezinho, "por cento dos votos válidos");
		System.out.printf("VOTOS BRANCOS OU NULOS: " + quantidadeVotosBrancos + percentualBranco, "por cento dos votos válidos");
		
		
		s.close();
	}
}
