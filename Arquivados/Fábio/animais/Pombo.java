package animais;

public class Pombo extends AnimalVoadorAB{	

	

	public Pombo(String nome, String tipo, String idade, String habitat, int qtPatas, int peso, int quantidadeAssas,
		double altura, int envergaduraAsa) {
		super(nome, tipo, idade, habitat, qtPatas, peso, quantidadeAssas, altura, envergaduraAsa);		
	}

	@Override
	String voar() {
		
		return "Velocidade máxima de 150km/h";
	}

	@Override
	public String comer() {
		
		return "Grãos e sementes";
	}

	@Override
	public String moverse() {
		
		return "Andando e voando";
	}

	@Override
	public String dormir() {
		
		return "Dormem 10 horas";
	}
	
	

}
