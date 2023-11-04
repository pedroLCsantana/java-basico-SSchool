package animais;

public class Leao extends AnimalTerrestreAB{
	

	public Leao(String nome, String tipo, String idade, String habitat, int qtPatas, int peso, double altura) {
		super(nome, tipo, idade, habitat, qtPatas, peso, altura);
	}

	@Override
	public String comer() {
		return "5kg a 7kg por dia";
	}

	@Override
	public String moverse() {
		return "Velocidade máxima 74 km/h";
	}
	
	@Override
	public String dormir() {
		return "13 a 20 horas";
	}
}