import java.util.Scanner;

public class TresDois{
    public static void main(String[] args){
        
        int div = 0;

        for (int i = 1; i <= 100; i++) {
            
            if(i % 3 == 0){
                div =  (i)/2;
                
                System.out.println("O multiplo de 3 é: "+i); 
                System.out.println("O resultado da divisão por 2 é: "+div);
                System.out.println("O resto da divisão é: "+(i % 2));
                System.out.println();

            }
        }                            
    }
}