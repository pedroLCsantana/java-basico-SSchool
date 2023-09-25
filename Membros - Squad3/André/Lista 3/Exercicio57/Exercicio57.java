import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira data (dia, mês e ano, separados por espaços):");
        int diaInicio = scanner.nextInt();
        int mesInicio = scanner.nextInt();
        int anoInicio = scanner.nextInt();

        System.out.println("Informe a segunda data (dia, mês e ano, separados por espaços):");
        int diaFim = scanner.nextInt();
        int mesFim = scanner.nextInt();
        int anoFim = scanner.nextInt();

        Date dataInicio = criarData(anoInicio, mesInicio, diaInicio);
        Date dataFim = criarData(anoFim, mesFim, diaFim);

        Calendar calendario = new GregorianCalendar();
        calendario.setTime(dataInicio);

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Datas entre " + formatoData.format(dataInicio) + " e " + formatoData.format(dataFim) + ":");

        while (!calendario.getTime().after(dataFim)) {
            System.out.println(formatoData.format(calendario.getTime()));
            calendario.add(Calendar.DAY_OF_MONTH, 1);
        }

        scanner.close();
    }

    public static Date criarData(int ano, int mes, int dia) {
        Calendar calendario = new GregorianCalendar(ano, mes - 1, dia);
        return calendario.getTime();
    }
}