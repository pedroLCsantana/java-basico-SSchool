import java.util.Scanner;

class ValidarDataAniver
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String[] nomesMeses = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int[] qtDiasMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        byte diaAniver;
        byte mesAniver;

         System.out.println("Informe o dia do seu anivesario: ");
        diaAniver = read.nextByte();

         System.out.println("Informe o mês do seu anivesario (Em formato de número): ");
        mesAniver = read.nextByte();

        if(mesAniver < 1 || mesAniver > 12)
        {
            System.out.println("O mês informado é INVALIDO. Tente novamente!");
        }
        else if(diaAniver < 1 || diaAniver > qtDiasMes[mesAniver-1])
        {
            System.out.println("O dia informado é INVALIDO. Tente novamente!");
            System.out.println("O mês de "+nomesMeses[mesAniver-1]+" possui "+qtDiasMes[mesAniver-1]+" dias.");
        }
        else
        {
            System.out.println("Data Valida! Seu aniversario é dia "+diaAniver+" de "+nomesMeses[mesAniver-1]+"!!");
        }
    }
}