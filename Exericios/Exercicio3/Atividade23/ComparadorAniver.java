import java.util.Scanner;

class ComparadorAniver
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        ValidadorAniver Validador = new ValidadorAniver();
        Pessoa[] listPessoas = {p1, p2};

        
        for(int countP=1; countP <= listPessoas.length; countP++)
        {
            

                System.out.println("Informe o nome da pessoa "+countP+": ");
                listPessoas[countP-1].nome = read.next();

            do{ // Validando data

                System.out.println("Informa o dia de nascimento de "+listPessoas[countP-1].nome+": ");
                listPessoas[countP-1].diaNascimento = read.nextInt();

                System.out.println("Informa o mês de nascimento de "+listPessoas[countP-1].nome+": ");
                listPessoas[countP-1].mesNascimento = read.nextInt();

            }while(!Validador.validarData(listPessoas[countP-1].diaNascimento, listPessoas[countP-1].mesNascimento));
           
        }

        // Quem faz aniversario primeiro?
        if(listPessoas[0].mesNascimento < listPessoas[1].mesNascimento)  // Comparando o Mês
        {
            System.out.println(listPessoas[0].nome+" faz aniversario primeiro!");
        }
        else if(listPessoas[0].mesNascimento > listPessoas[1].mesNascimento)
        {
            System.out.println(listPessoas[1].nome+" faz aniversario primeiro!");
        }
        else // Se for iqual o mês
        {
            if(listPessoas[0].diaNascimento < listPessoas[1].diaNascimento) // Comparando o Dia
            {
                System.out.println(listPessoas[0].nome+" faz aniversario primeiro!");
            }
            else if(listPessoas[0].diaNascimento > listPessoas[1].diaNascimento)
            {
                System.out.println(listPessoas[1].nome+" faz aniversario primeiro!");
            }
            else // Dias iquais
            {
                System.out.println(listPessoas[0].nome+" e "+listPessoas[1].nome+" fazem aniversario no mesmo dia!");
            }
        }
    }
}