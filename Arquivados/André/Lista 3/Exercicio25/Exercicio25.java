import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um horário no formato HH:MM:SS");
        String horario = scanner.nextLine();
        
        if (validarHorario(horario)) {
            System.out.println("Horário válido!");
        } else {
            System.out.println("Horário inválido. Certifique-se de usar o formato correto.");
        }
        
        scanner.close();
    }
    
    public static boolean validarHorario(String horario) {
        String[] partes = horario.split(":");
        
        if (partes.length != 3) {
            return false;
        }
        
        try {
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);
            int segundos = Integer.parseInt(partes[2]);
            
            if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}