import java.util.Scanner;

class Quilometragem
{
    public static void main(String[] args)
    {
        Tanque t1 = new Tanque("Tanque 1");
        Tanque t2 = new Tanque("Tanque 2");
        Tanque t3 = new Tanque("Tanque 3");
        Scanner read = new Scanner();

        Tanque[] listTanques = {t1, t2, t3};
        
        for(Tanque t: listTanques)
        {
    
            System.out.printf("Informa a distância percorrida(KM) pelo "+t.nome+": ")
            int t.kmPercorrido = read.nextInt();

            System.out.printf("Informa o consumo em gasolina(l) pelo "+t.nome+": ")
            int t.qtGasolina = read.nextInt();
            
        }

        for(Tanque t: listTanques)
        {
            System.out.println(t.consumoPorLitro()+" / litro") 
        }

        
    }


}

class Tanque
{
    String nome;
    int qtGasolina;
    int kmPercorrido;
    final int QT_MAX = 55;

    public Tanque(String nome){
        this.nome = nome;
    }

    public float consumoPorLitro();
    {
        return ((float) kmPercorrido/ (float) qtGasolina);
    }

}