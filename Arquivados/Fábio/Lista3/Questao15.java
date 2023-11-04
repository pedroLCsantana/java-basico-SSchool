import java.util.Scanner;

class Questao15
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String[] nomesMeses = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int[] qtDiasMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        byte diaAniver;
        byte mesAniver;        

        //Questao 18
        int diaAtual, mesAtual, anoAtual, anoAniver, idade;

         System.out.println("Informe o dia do seu anivesario: ");
        diaAniver = read.nextByte();

         System.out.println("Informe o mês do seu anivesario (Em formato de número): ");
        mesAniver = read.nextByte();

        System.out.println("Informe o ano do seu anivesario (Com quatro digitos): ");
        anoAniver = read.nextInt();

        // Inicio da parte da Questão 18
        System.out.println("Informe dia atual: ");
        diaAtual = read.nextInt();
        System.out.println();
        System.out.println("Informe mês atual: ");
        mesAtual = read.nextInt();
        System.out.println();
        System.out.println("Informe ano atual: ");
        anoAtual = read.nextInt();
        System.out.println();

        idade = (anoAtual-anoAniver);
        //Fim da parte da Questão 18



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

        //Questão 16

        if (mesAniver >=1 && mesAniver <= 3){
            System.out.println("Nasceu no primeiro trimestre");
            System.out.println();
        }

        if (mesAniver >=4 && mesAniver <= 6){
            System.out.println("Nasceu no segundo trimestre");
            System.out.println();
        }

        if (mesAniver >=7 && mesAniver <= 9){
            System.out.println("Nasceu no terceiro trimestre");
            System.out.println();
        }

        if (mesAniver >=10 && mesAniver <= 12){
            System.out.println("Nasceu no quarto trimestre");
            System.out.println();
        }

        System.out.println("Você tem "+idade+" anos de idade");
        
        
	}
    
}
