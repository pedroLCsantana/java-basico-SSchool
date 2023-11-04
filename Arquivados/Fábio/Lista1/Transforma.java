public class Transforma{
    public static void main(String[] args){
      
    
    int y = 0;  
	    
        
      for (int x = 13; x != 1; x = y) {
        if(x % 2 == 0){

                  System.out.println(x+" é par!");
                  System.out.println(y=x/2);
            	}
		    else{
                System.out.println("O valor de x é: "+x+" e ele é impar!");
                System.out.println("O valor de y é: "+(y=3*x+1));
        }
        
      }  
	}
}