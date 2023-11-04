import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento:");
        int anoNasc = scan.nextInt();

        System.out.println("Insira o ano atual");
        int anoAtual = scan.nextInt();

        scan.close();
        
        System.out.println("Sua idade esse ano será: " + (anoAtual - anoNasc) + " anos");

    }
}