import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivrariaVirtual {
	
	public static final int MAX_IMPRESSOS = 10;
	public static final int MAX_ELETRONICOS = 20;
	public static final int MAX_VENDAS = 50;
	
	public static int numImpressos;
	public static int numEletronicos;
	public static int numVendas;

	public static void main(String[] args) {


		// Menu

		boolean toMenu = true;
		do {
			switch (menuInicial()) {

				case 1 -> cadastrarLivros();

				case 2 -> System.out.println("Escolha 2");

				case 3 -> System.out.println("Escolha 3");

				case 4 -> System.out.println("Escolha 4");

				case 0 -> toMenu=false;

				default -> System.out.println("Nenhuma opção");

			}
		}while(toMenu);
	}

	public static int menuInicial(){
		System.out.println("===================== MENU ========================");
		System.out.println("**Sair: 0");

		System.out.println("Cadastrar um livro - 1");
		System.out.println("Realizar uma venda - 2");
		System.out.println("Listar todas os livros cadastrados - 3");
		System.out.println("Listar todas as vendas de livros - 4");


		System.out.print("\nEscolha uma das opções a cima: ");
		Scanner read = new Scanner(System.in);
		int opcao = read.nextInt();

		return opcao;
	}

	public static void cadastrarLivros() {
	
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		
		System.out.println("=====================CADASTRO DOS LIVROS========================");

		Scanner s = new Scanner(System.in);
		
		System.out.print("Deseja cadastrar um livro s/n: ");
		char opcao = s.next().charAt(0);
		
		while(opcao == 's') {
			
			System.out.print("Digite o titulo do livro: ");
			s.nextLine();
			String titulo = s.nextLine();
			
			System.out.print("Digite o autor do livro: ");
			String autores = s.nextLine();
			System.out.print("Digite a editora do livro: ");
			String editora = s.nextLine();
			System.out.print("Digite o preco do livro: ");
			float preco = s.nextFloat();
			System.out.println();
			System.out.print("O livro impresso ou eletronico? ");
			char opcaoLivro = s.next().charAt(0);

			if(opcaoLivro == 'i') {
				System.out.print("Digite o frete: ");
				float frete = s.nextFloat();
				System.out.print("Digite a quantidade em estoque: ");
				int estoque = s.nextInt();
				listaLivros.add(new Impresso(titulo, autores, editora, preco, frete, estoque));
				
//				numImpressos++;
//				
//				if(numImpressos > MAX_IMPRESSOS) {
//					System.out.println("Numero de livros no limite maximo!");
//				}
			}
			
			if(opcaoLivro == 'e') {
				System.out.print("Digite o tamanho: ");
				int tamanho = s.nextInt();
				
				listaLivros.add(new Eletronico(titulo, autores, editora, preco, tamanho));
			}
			
			System.out.println();
			System.out.print("Deseja cadastrar um livro s/n: ");
			System.out.println();
			opcao = s.next().charAt(0);
			
			
			
			if(opcao == 'n') {
				break;
			}
		}

		for(Livro l : listaLivros) {
			System.out.println(l);
			System.out.println("------------------------");
			
		}
		
		s.close();
	}





}