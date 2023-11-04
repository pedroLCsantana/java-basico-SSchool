import java.util.ArrayList;

public abstract class Livro {

	private String titulo;
	private String autores;
	private String editora;
	private float preco;

	Livro(){
	}
	
	Livro(String titulo, String autores, String editora, float preco){
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return 
		"Titulo do livro: " + this.titulo + "\n"
		+ "Autor do livro: " + this.autores + "\n"
		+ "Editora do livro: " + this.editora + "\n"
		+ "Preço do livro: " + this.preco + "\n";
	}
	
}
