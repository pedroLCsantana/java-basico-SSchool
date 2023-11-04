package Exericios.Exercicios_Herança.src.e02;

import Exericios.Exercicios_Herança.src.e01.*;

public class Fornecedor extends Pessoa {

    double valorDivida;
    double valorCredito;

    public Fornecedor(){
        super();
    }

    protected Fornecedor(String primeiroNome, String ultimoNome){
        super(primeiroNome, ultimoNome);
    }

    protected Fornecedor(String primeiroNome, String ultimoNome, int dia, int mes, int ano){
        super(primeiroNome, ultimoNome, dia, mes, ano);
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
}
