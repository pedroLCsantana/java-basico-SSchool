import java.util.Scanner;

class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("O algoritmo mostrara todos os numeros primos anteriores ao numero escolhido (Maximo 1000)");
        System.out.printf("Escolha um numero: ");
        
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        if(num <= 1000) // Limitador
        {
            for(int i = num; i > 1; i--) // De um numero até 0 ; Verificação Um por um
            {
                
            
                if(i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) // Multiplo? Se não for, é primo
                {
                    System.out.println(i);
                        
                }
                else if(i==2 || i == 3 || i == 5 || i == 7)// Primos Iniciais
                {
                    System.out.println(i);
                }
                
                
            }
        }
        
    }
}