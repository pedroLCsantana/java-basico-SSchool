import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivrariaVirtual {

	protected static ArrayList<Livro> listLivrosCadastros = new ArrayList<>();

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
		int opcao = -1;
		boolean bLoop = false;
		do {
			try {
				Scanner read = new Scanner(System.in);
				opcao = read.nextInt();
				bLoop = false;
			} catch (Exception e) {
				bLoop = true;
				System.out.print("Opção invalida! Digite um número: ");
			}
		}while (bLoop);


		return opcao;
	}

	public static void cadastrarLivros() {
	
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		
		System.out.println("=====================CADASTRO DOS LIVROS========================");

		Scanner s = new Scanner(System.in);
		
		System.out.print("Deseja cadastrar um livro s/n: ");
		char opcao = s.next().toLowerCase().charAt(0);
		
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
			System.out.print("O livro é impresso, eletronico, ou ambos? ");
			char opcaoLivro = s.next().toLowerCase().charAt(0);

			if(opcaoLivro == 'i') {
				System.out.print("Digite o frete: ");
				float frete = s.nextFloat();
				System.out.print("Digite a quantidade em estoque: ");
				int estoque = s.nextInt();
				listaLivros.add(new Impresso(titulo, autores, editora, preco, frete, estoque));

			}
			
			if(opcaoLivro == 'e') {
				System.out.print("Digite o tamanho(KB): ");
				int tamanho = s.nextInt();
				
				listaLivros.add(new Eletronico(titulo, autores, editora, preco, tamanho));
			}

			if(opcaoLivro == 'a') {
				System.out.print("Digite o tamanho(KB): ");
				int tamanho = s.nextInt();

				System.out.print("Digite o frete: ");
				float frete = s.nextFloat();
				System.out.print("Digite a quantidade em estoque: ");
				int estoque = s.nextInt();

				listaLivros.add(new Eletronico(titulo, autores, editora, preco, tamanho));
				listaLivros.add(new Impresso(titulo, autores, editora, preco, frete, estoque));
			}
			
			System.out.println();
			System.out.print("Deseja cadastrar um livro s/n: ");
			System.out.println();
			opcao = s.next().toLowerCase().charAt(0);
		}

		boolean temCadastro = false;
		for(Livro l : listaLivros) {
			System.out.println(l);

			for (Livro lc : listLivrosCadastros){
				if(lc.getTitulo().equals(l.getTitulo())){
					temCadastro = true;
					System.out.println(l.getTitulo()+ " ja tem cadastro no sistema");
					break;
				}
			}
			if(!temCadastro){
				listLivrosCadastros.add(l);
				System.out.println("Livro adicionado no sistema!");
			}

			System.out.println("------------------------");
		}


	}





}
