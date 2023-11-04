package e03;

import e01.Pessoa;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private float imposto;

    protected Empregado(String primeiroNome, String ultimoNome, int dia, int mes, int ano, double salarioBase, float imposto){
        super( primeiroNome,  ultimoNome,  dia,  mes,  ano);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        codigoSetor = 1;
    }

    public double calcularSalario()
    {
        double salario = 0;

        if(salarioBase != 0 && imposto != 0)
        {
            salario = salarioBase - salarioBase*imposto;
            return salario;
        }
        else
        {
            if (salarioBase == 0)
            {
                System.out.println("Salario Base não foi informado.");
            }
            if (imposto == 0)
            {
                System.out.println("Imposto não informado.");
            }
            System.out.println("Impossível calcular o salario. Informe os dados.");
        }

        return salario;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    @Override
    public void info() {
        super.info();

        System.out.println("Salario: "+this.calcularSalario());
    }
}
