package heranca;

public class FornecedorTeste {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("casas1", "rua abc", "71999999999", 4000, 1000);

        System.out.println(f1.obterSaldo());
    }
    
}
