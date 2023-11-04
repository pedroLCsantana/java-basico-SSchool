package Exericios.Exercicios_Herança.src.e01;

public class Aniversario
{
    short anoAtual = 2023;

    private byte dia;
    private byte mes;
    private short ano;

    protected byte calcularIdade(){
        byte idade = (byte) (anoAtual - ano);
        return idade;
    }

    protected void setDia(byte dia){
        this.dia = dia;
    }

    protected void setMes(byte mes){
        this.mes = mes;
    }

    protected void setAno(short ano){
        this.ano = ano;
    }

    protected byte getDia(){
        return dia;
    }

    protected byte getMes(){
        return mes;
    }

    protected short getAno(){
        return ano;
    }
}