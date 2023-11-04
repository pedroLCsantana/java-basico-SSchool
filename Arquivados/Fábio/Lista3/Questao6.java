import java.util.Scanner;

public class Questao6{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
       	System.out.println("Escreva o valor do raio");

       	float r = 5;
       	double PI = 3.1416;
       	double a = PI * Math.pow(r, 2);
        
        System.out.println(String.format("O valor da área é: %.2f",a));                       
    }
}