package Exericios.Exercicios_Herança.src.e05;
import Exericios.Exercicios_Herança.src.e03.Empregado;

public class Operario extends Empregado {

    double valorProducao; // dinheiro por produção
    float comissaoPor100; // porcentagem
    public Operario(String primeiroNome, String ultimoNome, int dia, int mes, int ano, double salarioBase, float imposto)
    {
        super(primeiroNome, ultimoNome, dia, mes, ano, salarioBase, imposto);
    }


    @Override
    public double calcularSalario() {
        if(comissaoPor100 !=0){
            return super.calcularSalario() + valorProducao * comissaoPor100;
        }else {
            System.out.println("Comissão não informada");
            return 0;
        }

    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public float getComissaoPor100() {
        return comissaoPor100;
    }

    public void setComissaoPor100(float comissaoPor100) {
        this.comissaoPor100 = comissaoPor100;
    }
}
