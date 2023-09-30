package heranca;

public class Vendedor extends Empregado{
    
    private double valorVendas;

    Vendedor(){
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double valorVendas){
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.valorVendas = valorVendas;
    }
    
    public double getvalorVendas  (){
    	return this.valorVendas;
    }
   	
	public void setvalorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

   
     public double calcularSalario(){
        return super.calcularSalario()+valorVendas;
    }    
		
}