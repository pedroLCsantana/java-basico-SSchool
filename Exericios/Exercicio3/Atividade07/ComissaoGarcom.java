import java.util.Scanner;

class ComissaoGarcom
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        double valorDespesa;
        double valorComissao;
        final double PERCENTUAL_COMISSAO = 0.1;

        System.out.println("Informe a despesa do cliente: ");
        valorDespesa = read.nextDouble();

        valorComissao = valorDespesa*PERCENTUAL_COMISSAO;
        System.out.println("O garçom irá receber R$"+valorComissao+" de comissão pela despesa do cliente.");

    }
}