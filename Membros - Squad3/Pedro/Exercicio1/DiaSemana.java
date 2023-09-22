import java.util.Scanner;

class DiaSemana
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Qual o dia da Semana?");
        System.out.printf("Digite um numero entre 1 a 7: ");
        int num = read.nextInt();

        if(num < 8 && num > 0)
        {
            String[] diasSemanas = new String[7];

            diasSemanas[0] = "O dia 1 é Segunda-feira";
            diasSemanas[1] = "O dia 2 é Terça-feita";
            diasSemanas[2] = "O dia 3 é Quarta-feita";
            diasSemanas[3] = "O dia 4 é Quinta-feira";
            diasSemanas[4] = "O dia 5 é Sexta-feita";
            diasSemanas[5] = "O dia 6 é Sabado";
            diasSemanas[6] = "O dia 7 é Domingo";

            System.out.println(diasSemanas[num-1]);
        }
        else
        {
            System.out.println("O numero tem que ser entre 1 e 7. Tente novamente");
        }
        


        

    }
}