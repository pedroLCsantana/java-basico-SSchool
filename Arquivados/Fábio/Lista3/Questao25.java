import java.util.Scanner;

public class Questao25{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

	System.out.println();
	System.out.println("Informe a hora com dois digitos");
	int hh = ler.nextInt();    
    if (hh >= 0 || hh <=23){
        System.out.println();        
    } 
    else{
        System.out.println("A hora é inválida");
    } 

    System.out.println("Informe os minutos com dois digitos");        
    int mm = ler.nextInt();
    System.out.println();       

    if (mm >= 0 || mm <=59){ 
        System.out.println();  
                        
    }

    else{
        System.out.println("Os minutos são inválidos");
    }

    System.out.println("Informe os segundos com dois digitos");
        int ss = ler.nextInt();
        System.out.println();  

    if (ss >= 0 || ss <=59){
        System.out.println("A hora informada é: "+hh+":"+mm+":"+ss);
    }
    else{
        System.out.println("Os segundos são inválidos");
    }

        ler.close();
    }            
}