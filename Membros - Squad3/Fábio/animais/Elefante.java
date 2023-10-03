package animais;

public class Elefante extends AnimalTerrestreAB{

	
	public Elefante(String nome, String tipo, String idade, String habitat, int qtPatas, int peso, double altura) {
		super(nome, tipo, idade, habitat, qtPatas, peso, altura);
		
	}

	@Override
	public String comer() {
		return "7% do seu peso por dia";
	}

	@Override
	public String moverse() {
		return "Velocidade máxima 40 km/h";
	}
	
	@Override
	public String dormir() {
		return "2 horas";
	}
	
	
}
