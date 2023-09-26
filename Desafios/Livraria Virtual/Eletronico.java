package livraria;

public class Eletronico extends Livro{

	int tamanho;
	
	Eletronico(){
	}

	public Eletronico(String titulo, String autores, String editora, float preco, int tamanho) {
		super(titulo, autores, editora, preco);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Tamanho: " + tamanho + "KB";
	}
	
	
}
