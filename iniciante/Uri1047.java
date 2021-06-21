import java.util.Scanner;

public class Uri1047 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var horaInicio = scanner.nextInt();
        var minutoInicio = scanner.nextInt();
        var horaFim = scanner.nextInt();
        var minutoFim = scanner.nextInt();

        if (horaInicio == horaFim && minutoInicio == minutoFim) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return;
        }

        int tempoInicio = (horaInicio * 60) + minutoInicio;
        int tempoFim = (horaFim * 60) + minutoFim;

        final var diaEmMinutos = 1440;

        var duracaoTotalEmMinutos = Math.abs(Math.floorMod(tempoFim - tempoInicio, diaEmMinutos));

        var duracaoEmMinutos = duracaoTotalEmMinutos % 60;
        var duracaoEmHoras = (duracaoTotalEmMinutos - duracaoEmMinutos) / 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoEmHoras, duracaoEmMinutos);
    }
}
