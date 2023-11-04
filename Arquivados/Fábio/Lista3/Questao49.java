import java.util.Scanner;
public class Questao49{
 
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);


        int n1 = 0, n2 = 1;
        for (int i = 50; i > 0; i--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Fim");
 
    }
}