import java.util.Scanner;

public class Ferragens{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int cod;
        System.out.println("Escolha conforme os itens abaixo:");
        System.out.println("001 - Parafuso");
        System.out.println("002 - Porca");
        System.out.println("003 - Prego");
        System.out.println("");
        
        cod = ler.nextInt();
        
        if(cod == 001){
                System.out.println();
                System.out.println("Parafuso");
        }
		else if(cod == 002){
                System.out.println();
                System.out.println("Porca");
        }
        else if(cod == 002){
                System.out.println();
                System.out.println("Prego");
        }
        else {
                System.out.println();
                System.out.println("Diversos");
        }
    }
}

