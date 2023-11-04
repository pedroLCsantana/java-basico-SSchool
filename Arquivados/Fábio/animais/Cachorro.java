package animais;


public class Cachorro extends AnimalTerrestreAB{
	
		
	public Cachorro(String nome, String tipo, String idade, String habitat, int qtPatas, int peso, double altura) {
		super(nome, tipo, idade, habitat, qtPatas, peso, altura);
	}

	@Override
	public String comer() {
		return "Comem 95g a 530g por dia";
	}

	@Override
	public String moverse() {
		return "Velocidade máxima km/h";
	}
	
	@Override
	public String dormir() {
		return "12 – 14 horas";
	}
	
	
}