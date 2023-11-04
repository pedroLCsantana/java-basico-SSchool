import java.util.Scanner;

public class Media50{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int cont = 0;
        double soma = 0;
        double media = 0;

        while (cont <50) {
            cont++; 
            System.out.print("Digite o "+cont+"º número: ");   
            System.out.println();         
            double num = ler.nextDouble();
            soma += num;                       
        }
        media = (soma / cont);

        System.out.println("A média dos 50 números é: "+media);
    }
}
