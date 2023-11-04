import java.util.Scanner;

public class MediaDo50{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int cont = 0;
        double soma = 0;
        double media = 0;

        do {
            cont++; 
            System.out.print("Digite o "+cont+"º número: ");   
            System.out.println();         
            double num = ler.nextDouble();
            soma += num;                       
        } while (cont <50);

        media = (soma / cont);
        System.out.println("A média dos 50 números é: "+media);
    }
}