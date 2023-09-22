public class TrocarValor{
    public static void main(String[] args){

        int A = 5;
        int B = 10;
	int C = 0;

	System.out.println();
	System.out.println("Os valores de A e B são:");
	System.out.println();
        System.out.println("Valor de A: "+A);
        System.out.println("Valor de B: "+B);
	System.out.println();
       
        C = A;
        A = B;
        B = C;

	System.out.println();
	System.out.println("Os valores foram trocados");
	System.out.println();
        System.out.println("Valor de A: "+A);
        System.out.println("Valor de B: "+B);
    }
}