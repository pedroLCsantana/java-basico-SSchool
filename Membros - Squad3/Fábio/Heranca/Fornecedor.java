package heranca;

public class Fornecedor extends Pessoa {
    double valorCredito;
    double valorDivida;

    Fornecedor(){
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
		return this.valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

    public double getValorDivida() {
		return this.valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

    
}
