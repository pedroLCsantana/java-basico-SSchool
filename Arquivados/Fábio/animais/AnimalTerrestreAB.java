package animais;

public abstract class  AnimalTerrestreAB extends AnimalAB{
	 String nome;
	 String tipo;
	 String idade;
	 String habitat;
	 int qtPatas;
	 int peso;
	 double altura;
	 
	public AnimalTerrestreAB(String nome, String tipo, String idade, String habitat, int qtPatas, int peso,
			double altura) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.habitat = habitat;
		this.qtPatas = qtPatas;
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
	public int getQtPatas() {
		return qtPatas;
	}
	public void setQtPatas(int qtPatas) {
		this.qtPatas = qtPatas;
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
	@Override
	public String comer() {
		
		return "";
	}
	@Override
	public String moverse() {
		
		return "";
	}
	@Override
	public String dormir() {
		
		return "";
	}
	
		 
	 
}
