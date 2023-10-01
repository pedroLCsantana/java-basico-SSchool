package heranca;

import java.util.Scanner;

public class Heranca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println();
	 	System.out.println("*** ESCOLHA A SUA OPÇÃO ***");	 	
	 	System.out.println("1 - Empregado");
	 	System.out.println("2 - Fornecedor");
	 	System.out.println("3 - Administrador");
	 	System.out.println("4 - Operario");
	 	System.out.println("5 - Vendedor");
	 	System.out.println("0 - Sair");
	 	
		Empregado 		e1 = new Empregado("Empregado", "rua abc", "11111111111", 1, 1000);
		Fornecedor 		f1 = new Fornecedor("Fornecedor", "rua def", "71222222222", 2, 2000);
		Administrador 	a1 = new Administrador("Administrador", "rua ghi", "71333333333", 3, 3000, 500);
		Operario 		o1 = new Operario("Operario", "rua jlm", "71444444444", 5, 4000, 1000);
		Vendedor 		v1 = new Vendedor("Vendedor", "rua ", "71444444444", 5, 5000, 1500);
		
				
		x = sc.nextInt();
		
	  	while (x>0){	  		
	  		int y = x;
  		
  			switch (y) {
			
	  			case 1: {
					
	  				System.out.println(e1); 
	  				System.out.println(e1.calcularSalario());
				} break;
	  			
	  			case 2: {
					
	  				System.out.println(f1); 
		  			System.out.println(f1.obterSaldo());
		  			 			
				} break;
	  			
	  			case 3: {
					
	  				System.out.println(a1);
		  			System.out.println(a1.calcularSalario());
				} break;
	  			
				case 4: {
								
				  	System.out.println(o1);
					System.out.println(o1.calcularSalario());			
				} break;
				
				case 5: {
								
				  	System.out.println(v1);
					System.out.println(v1.calcularSalario());			
				} break;
		  			
				
				default: 
					throw new IllegalArgumentException("Valor incorreto, por favor digite novamente: " + y);
  			} 	break;  							
  				  				  			
	
	  	}		
	  	
	  	System.out.println("Saindo ...");
	  	sc.close();
	}
}
	
	
	
	
