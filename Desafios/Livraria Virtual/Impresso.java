package livraria;

public class Impresso extends Livro{
	
	float frete;
	int estoque;
	
	Impresso(){
	}
	
	Impresso(String titulo, String autores, String editora, float preco, float frete, int estoque){
		super(titulo, autores, editora, preco);
		this.frete = frete;
		this.estoque = estoque;
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(float frete) {
		this.frete = frete;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void atualizarEstoque() {
		this.estoque --;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Frete: " + frete + "\n"
				+ "Estoque: " + estoque;
	}
	

}
