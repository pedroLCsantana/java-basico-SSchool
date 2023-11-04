
public class ContaCorrente
{
    // Atributos
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;



    // Funções
    public void creditar(double valor)
    {
        this.saldo += valor;
    }

    public void debitar(double valor)
    {
        this.saldo -= valor;
    }

    public void resumo(){

        System.out.println();
        System.out.println("Número da conta corrente: "+numero);
        System.out.println("Nome do titular: "+primeiroTitular.nome);

        if(segundoTitular != null){
            System.out.println("Nome do Segundo titular: "+segundoTitular.nome);
        }
        
        System.out.println("Saldo da conta: "+saldo);
        System.out.println("Limite Atual: "+(limiteTotal - saldo));
        System.out.println("Limite Total: "+limiteTotal);

        if(saldo < 0){
            System.out.println("Saldo deverot, procure seu gerente");
        }
    }

    public void setPrimeiroTitular(Cliente primeiroTitular){
        this.primeiroTitular = primeiroTitular;
    }

    public void setSegundoTitular(Cliente segundoTitular){
        this.segundoTitular = segundoTitular;
    }  
  
}