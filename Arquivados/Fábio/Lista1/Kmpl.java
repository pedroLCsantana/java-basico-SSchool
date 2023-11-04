import java.util.Scanner;

public class Kmpl {
	public static void main(String[] args) {

	 int km = 0;
	 int litros = 0;
	 int consumo = 0;
	 double media = 0;
	 int totalkm = 0;
	 int contador = 1;
	 
	 Scanner ler = new Scanner(System.in);

			while (km != -1) {	 	
			 	System.out.println();
			 	System.out.println("*** INFORME OS QUILÔMETROS RODADOS ***");
			 	System.out.println("Ou digite -1 para sair do programa");
			 	km = ler.nextInt();

			 	System.out.println();
			 	System.out.println("*** INFORME O CONSUMO DE COMBUSTÍVEL *** ");
			 	System.out.println("Ou digite -1 para sair do programa");
			 	System.out.println();
			 	litros = ler.nextInt();

			 	if (km > 0) {
			 		System.out.printf("Média do carro %d: %.2f KM/Litro\n", contador++, 
			 				(double) km / litros);
				}

			totalkm = totalkm + km;
			consumo = consumo + litros;
			media = (double) km / litros;


			System.out.println();
			System.out.println(String.format("Total de quilômetros rodados: %d", totalkm));
			System.out.println(String.format("Total de combustível gasto: %d", consumo));
			System.out.println(String.format("Quilômetros por litro: %.2f", media));		

			}			
	}
}