import java.util.Scanner;

public class Questao14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String mes = "";
       
        System.out.print("***** Escolha o mês *****");
        System.out.println();   
        System.out.println("Janeiro");
        System.out.println("Fevereiro");
        System.out.println("Março");
        System.out.println("Abril");
        System.out.println("Maio");
        System.out.println("Junho");
        System.out.println("julho");
        System.out.println("Agosto");
        System.out.println("Setembro");
        System.out.println("Outubro");
        System.out.println("Novembro");
        System.out.println("Dezembro");
        
        System.out.println();

        mes = sc.next();
        
            if (mes.equals("Janeiro")){
                System.out.println("Mês 1");
            }
            if (mes.equals("Fevereiro")){
                System.out.println("Mês 2");
            }
            if (mes.equals("Março")){
                System.out.println("Mês 3");
            }
            if (mes.equals("Abril")){
                System.out.println("Mês 4");
            }
            if (mes.equals("Maio")){
                System.out.println("Mês 5");
            }
            if (mes.equals("Junho")){
                System.out.println("Mês 6");
            }
            if (mes.equals("Julho")){
                System.out.println("Mês 7");
            }
            if (mes.equals("Agosto")){
                System.out.println("Mês 8");
            }
            if (mes.equals("Setembro")){
                System.out.println("Mês 9");
            }
            if (mes.equals("Outubro")){
                System.out.println("Mês 10");
            }
            if (mes.equals("Novembro")){
                System.out.println("Mês 11");
            }
            if (mes.equals("Dezembro")){
                System.out.println("Mês 12");
            }                      
               
    }
} 