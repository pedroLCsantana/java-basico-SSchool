package Exericios.Exercicio1.Atividade2;

import java.util.Scanner;

public class MostrarMaior {



    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        boolean typeRight = false;
        do{
            try{
                System.out.print("Digite o valor do 1º número: ");
                n1 = sc.nextInt();
                typeRight = true;
            }catch (Exception e) {
                System.out.println("Não é um numero inteiro, Tente novamente");
            }
        }while (!typeRight);

        typeRight = false;
        do{
            try{

                System.out.print("Digite o valor do 2º número: ");
                n2 = sc.nextInt();
                typeRight = true;

            }catch (Exception e) {
                System.out.println("Não é um numero inteiro, Tente novamente");
            }
        }while (!typeRight);

        if (n1 > n2){
            System.out.println("1º número, "+ n1 + ", é maior que o 2º número ,"+n2 );
        }else if(n2 > n1){
            System.out.println("2º número, "+ n2 + ", é maior que o 1º número ,"+n1 );
        }else{
            System.out.println("Os números são iguais");
        }

    }
}
