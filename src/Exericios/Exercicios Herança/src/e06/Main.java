public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Pedro", "Roberto", 10,12,1998, 10000, 0.1f);

        vendedor1.setComissaoPor100(0.15f);
        vendedor1.setValorVendas(15000);
        vendedor1.info();
    }
}
