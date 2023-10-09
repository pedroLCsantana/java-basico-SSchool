package test;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import dados.DadosMotorista;
import entities.enums.Sexo;

public class Cadastro {
	public static void main(String[] args) {

		int day;
		int mounth;
		int year;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("*********Formulário de Cadastro********* \n\n");

		System.out.print("Digite o nome completo ");
		String nome = sc.nextLine();

		System.out.println("Digite a data de nascimento: ");
		System.out.print("Dia: ");
		day = sc.nextInt();
		System.out.print("Mês: ");
		mounth = sc.nextInt();
		System.out.print("Ano: ");
		year = sc.nextInt();
		LocalDate dataNascimento = LocalDate.of(year,mounth,day);

		System.out.print("Digite o cpf ");
		String cpf = sc.nextLine();

		System.out.print("Digite o sexo ");
		String sexo = sc.nextLine();
		sexo.toLowerCase();
		System.out.print("Digite a CNH ");
		String cnh = sc.nextLine();

		DadosMotorista newProp = new DadosMotorista();

		if (sexo.equals("masculino")) {

			newProp.addMotorista(nome, dataNascimento, cpf, Sexo.MASCULINO, cnh);
		}

		if (sexo.equals("feminino")) {

			newProp.addMotorista(nome, dataNascimento, cpf, Sexo.FEMININO, cnh);
		}

		newProp.fecharConexao();
		sc.close();
	}
}
