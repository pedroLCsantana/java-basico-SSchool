import java.util.Scanner;
public class Questao45{
 
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

     float n1, maior;
     int count=2; 
 
     System.out.println("Número 1: ");
     n1 = sc.nextFloat();
     maior = n1;
 
        while(count <= 100){

            System.out.println("Número " + count + ": ");
            n1 = sc.nextFloat();
     
            if(n1 > maior){
                maior = n1;
            }
     
            count++;
        }

     sc.close();
 
     System.out.println("O maior número digitado é: "+maior);
 
    }
}