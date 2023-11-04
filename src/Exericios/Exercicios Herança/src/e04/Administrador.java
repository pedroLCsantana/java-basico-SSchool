import Empregado;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    protected Administrador(String primeiroNome, String ultimoNome, int dia, int mes, int ano, double salarioBase, float imposto)
    {
        super(primeiroNome, ultimoNome, dia, mes, ano, salarioBase, imposto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public void info() {
        super.info();
    }
}
