package Heranca;

public class Administrador extends Empregado{
    
        private double ajudaDeCusto;

    Administrador(){
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double getAjudaDeCusto  (){
    	return this.ajudaDeCusto;
    }
   	
	public void setCodigoSetor(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

    public double calcularSalario(){
        return this.salarioBase-(this.salarioBase*0.2);
    }   
		
}