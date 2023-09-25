import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as coordenadas do ponto superior esquerdo:");
        System.out.print("X1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Informe as coordenadas do ponto inferior direito:");
        System.out.print("X2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Y2: ");
        double y2 = scanner.nextDouble();

        if (x1 == x2 && y1 == y2) {
            System.out.println("Isso é um ponto.");
        } else if (x1 == x2 || y1 == y2) {
            if (x1 == x2) {
                System.out.println("Isso é uma reta vertical.");
            } else {
                System.out.println("Isso é uma reta horizontal.");
            }
        } else {
            System.out.println("Isso é um retângulo.");
            double area = Math.abs((x2 - x1) * (y2 - y1));
            System.out.println("Área do retângulo: " + area);

            System.out.println("Informe as coordenadas de outro ponto:");
            System.out.print("X: ");
            double x = scanner.nextDouble();
            System.out.print("Y: ");
            double y = scanner.nextDouble();

            if (x < x1 && y > y2) {
                System.out.println("O ponto está acima e à esquerda do retângulo.");
            } else if (x > x2 && y > y2) {
                System.out.println("O ponto está acima e à direita do retângulo.");
            } else if (x < x1 && y < y1) {
                System.out.println("O ponto está embaixo e à esquerda do retângulo.");
            } else if (x > x2 && y < y1) {
                System.out.println("O ponto está embaixo e à direita do retângulo.");
            } else if (x < x1 || x > x2 || y < y1 || y > y2) {
                System.out.println("O ponto está fora do retângulo.");
            } else {
                System.out.println("O ponto está dentro do retângulo.");
            }
        }
        scanner.close();
    }
}