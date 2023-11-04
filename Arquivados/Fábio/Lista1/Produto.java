import java.util.Scanner;

public class Produto{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        float produt = 1;

        for (int i = 1; i <= 30; i++) {
            
            if(i % 2 == 1){

                produt = produt * i;
            System.out.println(i);  

            }

        }
    
        System.out.println("O produtos é : "+produt);                         

    }
}
