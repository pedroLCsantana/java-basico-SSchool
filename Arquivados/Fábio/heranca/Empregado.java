package heranca;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;

    Empregado(){
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase){
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
    }
    
    public int getCodigoSetor  (){
    	return this.codigoSetor;
    }
   	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase (){
    	return this.salarioBase;
    }
   	
	public void setSalarioBaser(double salarioBase) {
		this.salarioBase = salarioBase;
	}
      	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario(){
        return this.salarioBase-(this.salarioBase*0.3);
    }   
	
	
}
