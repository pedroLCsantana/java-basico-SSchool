package animais;

public class Gato extends AnimalTerrestreAB{
	
	public Gato(String nome, String tipo, String idade, String habitat, int qtPatas, int peso, double altura) {
		super(nome, tipo, idade, habitat, qtPatas, peso, altura);
		
	}

	@Override
	public String comer() {
		return "Comem 40g a 75g por dia";
	}

	@Override
	public String moverse() {
		return "Velocidade máxima km/h";
	}
	
	@Override
	public String dormir() {
		return "12 – 16 horas";
	}
}
