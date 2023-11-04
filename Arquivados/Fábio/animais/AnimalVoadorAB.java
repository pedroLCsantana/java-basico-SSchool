package animais;

public abstract class AnimalVoadorAB extends AnimalAB{
	
	String nome;
	 String tipo;
	 String idade;
	 String habitat;
	 int peso;
	 int qtPatas;
	 int envergaduraAsa;
	 double altura;
	 
	 public AnimalVoadorAB(String nome, String tipo, String idade, String habitat, int qtPatas, int peso,
			int quantidadeAssas, double altura, int envergaduraAsa) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.habitat = habitat;
		this.qtPatas = qtPatas;
		this.peso = peso;
		this.qtPatas = qtPatas;
		this.envergaduraAsa = envergaduraAsa;
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

	public int getQtPatas() {
		return qtPatas;
	}

	public void setQtPatas(int qtPatas) {
		this.qtPatas = qtPatas;
	}

	public int getEnvergaduraAsa() {
		return envergaduraAsa;
	}

	public void setEnvergaduraAsa(int envergaduraAsa) {
		this.envergaduraAsa = envergaduraAsa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	String voar() {
		return "Consigo voar";		
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
