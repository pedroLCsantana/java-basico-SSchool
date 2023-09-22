class ProgramaBanco
{
    public static void main(String[] args)
    {
        Cliente P1 = new Cliente("Pedro");
        ContaCorrente C1 = new ContaCorrente("ABC26175", P1, 5000, 10000);
        
        C1.resumo();
        C1.debitar(400);

        C1.creditar(200);
        C1.creditar(200);
        C1.creditar(200);

        C1.segundoTitular = new Cliente("Roger");

        C1.resumo();
        

    }
}