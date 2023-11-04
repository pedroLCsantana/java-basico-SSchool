import java.util.Scanner;

public class Questao37 {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
			
	 	System.out.println();
	 	System.out.println("        *** PROGRAMA FATORAL ***       ");
	 	System.out.println("*** DIGITE UM NÚMERO MAIOR QUE ZERO ***");
	 	int x = sc.nextInt();
	 	System.out.println();

	 	int y = 1;

	  	while(x > 1){
	  		int z = x -1;
	  		y = (y * z);
	  		

	  		System.out.println(y);
	  		x--;
	  	}

	  	sc.close();
	  	
	}
}