import java.util.Scanner;

public class Questao53{
 
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.println("Digite o número para qual tabuada deseja resolver");
        System.out.println();
        x = sc.nextInt();

        for (int i = 1; i <=10; i++) {

            System.out.println(x+" X "+i+" = "+(x*i));
        }
        sc.close();
 
    }
}