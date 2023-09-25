import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia do seu aniversário: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês do seu aniversário: ");
        int mes = scanner.nextInt();

        boolean dataValida = verificarData(dia, mes);

        if (dataValida) {
            String nomeMes = obterNomeMes(mes);
            System.out.println("Data de aniversário válida! Mês: " + nomeMes);

            int trimestre = determinarTrimestre(mes);
            System.out.println("Nasceu no " + trimestre + "º trimestre do ano.");

            String signo = determinarSigno(dia, mes);
            System.out.println("Signo do horóscopo: " + signo);
        } else {
            System.out.println("Data de aniversário inválida.");
        }

        scanner.close();
    }

    public static boolean verificarData(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }

        if (mes == 2) {
            if (dia > 29) {
                return false;
            }
        }

        return true;
    }

    public static String obterNomeMes(int mes) {
        String[] nomesMeses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return nomesMeses[mes - 1];
    }

    public static int determinarTrimestre(int mes) {
        if (mes >= 1 && mes <= 3) {
            return 1;
        } else if (mes >= 4 && mes <= 6) {
            return 2;
        } else if (mes >= 7 && mes <= 9) {
            return 3;
        } else {
            return 4;
        }
    }

    public static String determinarSigno(int dia, int mes) {

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }
}