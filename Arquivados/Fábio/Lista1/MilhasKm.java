import java.util.Scanner;

public class MilhasKm{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        double valorMilhas;
        double km;

        System.out.print("***** Conversor de Milhas em Quilômetros *****");
        System.out.println();  
        System.out.print("Digite um valor em milhas");   
        System.out.println();  
        System.out.println();         
        valorMilhas = ler.nextInt();

        km = valorMilhas * 1609;

        System.out.print(valorMilhas+" milhas correspondem a "+km+" Km."); 
    }
}       