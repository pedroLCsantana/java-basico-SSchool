public class Main
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Roger", "Oliveira");
        Pessoa p3 = new Pessoa("Pedro", "Santana", 8,8,1997);

        p1.setPrimeiroNome("Lucia");
        p1.setUltimoNome("Maria");
        p1.setDataAniversario(15, 10, 1985);


        p1.info();
        p2.info();
        p3.info();

    }
}