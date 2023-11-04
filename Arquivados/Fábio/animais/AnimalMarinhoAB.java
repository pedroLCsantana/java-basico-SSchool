package animais;

public abstract class AnimalMarinhoAB extends AnimalAB  {
	
	String nome;
	 String tipo;
	 String idade;
	 String habitat;
	 int peso;
	 double altura;
	 
	
	public AnimalMarinhoAB(String nome, String tipo, String idade, String habitat, int peso, double altura) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.habitat = habitat;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	String nadar() {
		return "Consigo nadar";		
	}
	
	@Override
	public String comer() {
		
		return super.comer();
	}

	@Override
	public String moverse() {
		
		return super.moverse();
	}

	@Override
	public String dormir() {
		
		return super.dormir();
	}
	
}
