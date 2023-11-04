package Exericios.Exercicio1.Atividade9;

import java.util.Scanner;

class CalcAreaCirculo
{
    public static void main(String[] args)
    {
        System.out.println("Calculadora de Área de Circulos");

        Scanner read = new Scanner(System.in); // Leitor
        double raio;
        double areaCirculo;

        System.out.printf("Informe o raio do circulo que será medido: (CM)");
        raio = read.nextDouble();

        areaCirculo = Math.round(calcularArea_Circulo(raio));

        System.out.println("A área de um circulo de raio "+raio+"CM é aproximadamente: "+areaCirculo+"CM²");


    }

    public static double calcularArea_Circulo(double raio)
    {
        double pi = 3.14159265;

        return (pi*Math.pow(raio, 2));
    }
}