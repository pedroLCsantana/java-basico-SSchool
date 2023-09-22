import java.util.Scanner;

class MilhaParaKM
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite a milha:");
        double milha = read.nextDouble();
        
        double milhaEmKm = milha*1.609;

        System.out.println(milha +" milhas é iqual a "+milhaEmKm+" Quilometros");
    }
}