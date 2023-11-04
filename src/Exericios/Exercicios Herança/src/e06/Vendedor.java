import Empregado;

public class Vendedor extends Empregado {

    private double valorVendas;
    private float comissaoPor100;
    protected Vendedor(String primeiroNome, String ultimoNome, int dia, int mes, int ano, double salarioBase, float imposto)
    {
        super(primeiroNome, ultimoNome, dia, mes, ano, salarioBase, imposto);
    }

    @Override
    public double calcularSalario() {
        if(comissaoPor100 !=0){
            return super.calcularSalario() + valorVendas * comissaoPor100;
        }else {
            System.out.println("Comissão não informada");
            return 0;
        }

    }


    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getComissaoPor100() {
        return comissaoPor100;
    }

    public void setComissaoPor100(float comissaoPor100) {
        this.comissaoPor100 = comissaoPor100;
    }
}
