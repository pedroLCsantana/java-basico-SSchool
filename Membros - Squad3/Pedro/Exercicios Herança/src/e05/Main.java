package e05;

public class Main {
    public static void main(String[] args) {
        Operario operario1 = new Operario("Pedro", "Roberto", 10,12,1998, 10000, 0.1f);

        operario1.setComissaoPor100(0.15f);
        operario1.setValorProducao(2000);
        operario1.info();
    }
}
