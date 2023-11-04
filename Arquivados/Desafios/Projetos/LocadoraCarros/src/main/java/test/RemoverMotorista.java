package test;

import dados.DadosMotorista;

import java.util.Scanner;

public class RemoverMotorista {
    public static void main(String[] args) {
        DadosMotorista removeMot = new DadosMotorista();


        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o CPF do motorista, para remove-lo do sistema: ");
        String cpf = sc.nextLine();

        removeMot.removerMotorista(cpf);
    }

}
