import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {

	 float calc = 0;
		 
	 Scanner ler = new Scanner(System.in);
			
	 	System.out.println();
	 	System.out.println("*** INFORME SEU SALÁRIO ***");
	 	float	salario = ler.nextFloat();

	  	System.out.println();
	 	System.out.println("*** INFORME O SALÁRIO MÍNIMO ***");
	  	float mini = ler.nextFloat();

	  	calc = (salario/mini);
			
		System.out.println();
		System.out.println(String.format("Valor recebido em salário(s) mínimo(s): %.2f",calc));						
	}
}