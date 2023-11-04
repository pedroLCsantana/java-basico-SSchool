package teste;

import java.util.Scanner;

public class TestandoTryCatch {

    public static void main(String[] args) {
        Exception eLoop;
        eLoop = new Exception();
        System.out.println(eLoop);

        try{
            Scanner read = new Scanner(System.in);
            int option = read.nextInt();

        }catch(Exception e){
            eLoop = e;
            System.out.println(e);
        }
        if(eLoop.toString().equals("java.lang.Exception")){
            System.out.println("Passou pelo try");
        }else{
            System.out.println("Não passou");
            System.out.println(eLoop);
        }


    }
}
