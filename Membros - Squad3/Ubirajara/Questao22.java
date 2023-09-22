package lista3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args){
		// 22. Verifique se duas datas de aniversário (dia e mês) são iguais.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a primeira data no formato dd/mm/aaaa: ");
		String data1 = s.next();
		DateTimeFormatter d1Formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1 = LocalDate.parse(data1, d1Formatada);
		
		System.out.print("Digite a segunda data no formato dd/mm/aaaa: ");
		String data2 = s.next();
		LocalDate d2 = LocalDate.parse(data2, d1Formatada);
		
	
		
		if (d1.equals(d2)) {
			System.out.println("As datas digitadas foram iguais");
		}
		else {
			System.out.println("As datas digitadas foram diferentes");
		}
		s.close();
	
	}

}
