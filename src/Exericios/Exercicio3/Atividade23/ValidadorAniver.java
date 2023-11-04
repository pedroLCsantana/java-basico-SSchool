package Exericios.Exercicio3.Atividade23;

class ValidadorAniver
{
    public boolean validarData(int dia, int mes)
    {
        System.out.println("");
        String[] nomesMeses = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int[] qtDiasMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(mes < 1 || mes > 12)
        {
            System.out.println("O mês informado é INVALIDO. Tente novamente!\n");
            return false;
        }
        else if(dia < 1 || dia > qtDiasMes[mes-1])
        {
            System.out.println("O dia informado é INVALIDO. Tente novamente!");
            System.out.println("O mês de "+nomesMeses[mes-1]+" possui "+qtDiasMes[mes-1]+" dias.\n");
            return false;
        }
        else
        {
            System.out.println("");
            return true;
        }


    }
}