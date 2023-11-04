import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {

	 float salario_l = 0;
	 float salario_b = 0;
	 float desconto = 0;
	 float emp = 0;
	 float emp_lib = 0;
		 
	 Scanner ler = new Scanner(System.in);
			
	 	System.out.println();
	 	System.out.println("*** INFORME SEU SALÁRIO BRUTO ***");
	 	salario_b = ler.nextFloat();

	 	System.out.println();
	 	System.out.println("*** INFORME O VALOR DOS DESCONTOS ***");
	 	desconto = ler.nextFloat();

	  	System.out.println();
	 	System.out.println("*** INFORME O VALOR DO EMPRESTIMO REQUERIDO ***");
	  	emp = ler.nextFloat();

	  	salario_l = (salario_b-desconto);
	  	emp_lib = ((salario_l/100)*30);

	  		if (emp > emp_lib){
	  			System.out.println();
				System.out.println("Seu emprestimo foi recusado!");
	  		}
			else {
				System.out.println();
				System.out.println("Seu emprestimo foi liberado!");
	  		}					
	}
}