package test;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import dados.DadosMotorista;
import entities.enums.Sexo;

public class Cadastro {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("*********Formulário de Cadastro********* \n\n");

		System.out.print("Digite o nome completo: ");
		String nome = sc.nextLine();

		System.out.println("Digite a data de nascimento: ");
		System.out.print("Dia: ");
		int day = sc.nextInt();
		System.out.print("Mês: ");
		int mounth = sc.nextInt();
		System.out.print("Ano: ");
		int year = sc.nextInt();
		LocalDate dataNascimento = LocalDate.of(year,mounth,day);

		System.out.print("Digite o cpf: ");
		String cpf = sc.next();

		System.out.print("Digite o sexo: ");
		String sexo = sc.next();
		sexo.toLowerCase();

		System.out.println("Digite seu email: ");
		String email = sc.next();

		System.out.print("Digite a CNH: ");
		String cnh = sc.next();

		DadosMotorista newProp = new DadosMotorista();

		if (sexo.equals("masculino")) {

			newProp.addMotorista(nome, dataNascimento, cpf, email , Sexo.MASCULINO,  cnh);
		}

		if (sexo.equals("feminino")) {

			newProp.addMotorista(nome, dataNascimento, cpf, email, Sexo.FEMININO,  cnh);
		}

		newProp.fecharConexao();
		sc.close();
	}
}
