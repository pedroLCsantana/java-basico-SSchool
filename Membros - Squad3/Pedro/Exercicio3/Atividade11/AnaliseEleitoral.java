import java.util.Scanner;

class AnaliseEleitoral
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        byte idade;

        System.out.printf("Informe quantos anos você tem: ");
        idade = read.nextByte();

        if(idade < 16)
        {
            System.out.println("Você não pode votar ainda.");
        }
        else if((idade >= 16 && idade <= 18) || idade >= 65)
        {
            System.out.println("Você pode votar, seu voto é facultativo.");
        } 
        else 
        {
            System.out.println("Você tem a obrigação de votar!");
        }
    }
}