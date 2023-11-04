public class Dados{
    public static void main(String[] args){
      
        for (int i = 1; i <= 6; i++) {
            
            if (i <= 6){
                for (int j = 1; j <= 6; j++) {
                
                    if(i+j == 7){
                        System.out.println();
                        System.out.println("Quando i é "+i+", e j é "+j);
                        System.out.println(" A soma dos dois é: "+(i+j));
                    }
                }
            }       
        }    
    }
}