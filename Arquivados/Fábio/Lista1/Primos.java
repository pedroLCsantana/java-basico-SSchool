import java.util.Scanner;

public class Primos{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int n1 = 0;       
           
        System.out.print("Digite um número: ");   
        System.out.println();         
        n1 = ler.nextInt();
        System.out.println(); 
        System.out.print("Números primos: ");   

        for (int i = 2; i <= n1; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
        }
    }
}       
