import java.util.Scanner;

public class Semana{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        String[] semana;

        semana = new String[8];
        
        semana[0] = "Opção Inválida";
        semana[1] = "Segunda";
        semana[2] = "Terça";
        semana[3] = "Quarta";
        semana[4] = "Quinta";
        semana[5] = "Sexta";
        semana[6] = "Sábado";
        semana[7] = "Somingo";


        System.out.print("***** Semana *****");
        System.out.println();  
        System.out.println("Escolha um número referente ao dia da semana");   
        System.out.println("1 - Segunda");
        System.out.println("2 - Terça");
        System.out.println("3 - Quarta");
        System.out.println("4 - Quinta");
        System.out.println("5 - Sexta");
        System.out.println("6 - Sábado");
        System.out.println("7 - Dominto");
        System.out.println();

        int i = 0;
        i = ler.nextInt();
        System.out.print(semana[i]); 
    }
} 