import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private List<Livro> livros = new ArrayList<Livro>();
	private static int qtVendas = 0;
	private int numero;
	private String cliente;
	private float valor;
	
	public Venda() {
	}

	public Venda(int numero, String cliente, float valor) {
		
		Venda.qtVendas += 1;
		this.numero = 1;
		this.cliente = cliente;
		this.valor = valor;
	}

	public int getNumVendas() {
		return qtVendas;
	}

	public void setNumVendas(int numVendas) {
		this.qtVendas = numVendas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void addLivro(Livro l, int index) {   // não entendi o index
		livros.add(l);
	}
	
	public void listarLivros() {
		for(Livro nomeLivro : livros) {
			System.out.println(nomeLivro);
		}
	}
	
	
	
}
