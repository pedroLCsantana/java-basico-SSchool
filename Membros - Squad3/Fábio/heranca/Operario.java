package heranca;

public class Operario extends Empregado{
    
    private double valorProducao;

    Operario(){
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double valorProducao){
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.valorProducao = valorProducao;
    }
    
    public double getValorProducao  (){
    	return this.valorProducao;
    }
   	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

   
     public double calcularSalario(){
        return super.calcularSalario()+valorProducao;
    } 
   
		
}