package Exericios.Slide92;

public class ContaCorrente
{
    // Atributos
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    ContaCorrente( String numero, Cliente primeiroTitular, double saldo, double limiteTotal)
    {
        this.numero = numero;
        this.primeiroTitular = primeiroTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
    }

    // Funções
    public void creditar(double valor)
    {
        this.saldo += valor;
    }

    public void debitar(double valor)
    {
        this.saldo -= valor;
    }

    public void resumo()
    {
        System.out.println("Número da conta corrente: "+numero);

        System.out.println("Nome do titular: "+primeiroTitular.nome);
        if(segundoTitular != null){
            System.out.println("Nome do Segundo titular: "+segundoTitular.nome);
        }
        
        System.out.println("Saldo da conta: "+saldo);
        System.out.println("Limite Atual: "+(limiteTotal - saldo));
        System.out.println("Limite Total: "+limiteTotal);

        if(estaDevendo()){
            System.out.println("PROCURE O GERENTE!!! VOCÊ ESTÁ DEVENDO!!!!");
        }
    }

    public boolean estaDevendo()
    {
        if(saldo < 0){
            return true;
        }else{
            return false;
        }
    }
}