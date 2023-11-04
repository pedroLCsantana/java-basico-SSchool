package animais;

public class Peixe extends AnimalMarinhoAB{

	public Peixe(String nome, String tipo, String idade, String habitat, int peso, double altura) {
		super(nome, tipo, idade, habitat, peso, altura);
	}

	@Override
	String nadar() {		
		return "Nadando bem";
	}

	@Override
	public String comer() {		
		return "outros animais aquáticos de tamanho menor";
	}

	@Override
	public String moverse() {		
		return "Velocidade máxima de 129 km/h";
	}

	@Override
	public String dormir() {		
		return "Períodos de cerca de 20 minutos";
	}
	

}
