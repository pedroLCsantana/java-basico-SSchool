package Exericios.Exercicios_Herança.src.e04;

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Pedro", "Roberto", 10,12,1998, 10000, 0.1f);


        admin.setAjudaDeCusto(200);

        admin.info();
    }
}
