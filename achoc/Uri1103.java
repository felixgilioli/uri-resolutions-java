import java.util.Scanner;

public class Uri1103 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            var horaInicio = scanner.nextInt();
            var minutoInicio = scanner.nextInt();
            var horaFim = scanner.nextInt();
            var minutoFim = scanner.nextInt();

            if (horaInicio == 0 && minutoInicio == 0 && horaFim == 0 && minutoFim == 0) {
                break;
            }

            var tempoInicio = (horaInicio * 60) + minutoInicio;
            var tempoFim = (horaFim * 60) + minutoFim;

            final var diaEmMinutos = 1440;
            var tempoDeSono= Math.abs(Math.floorMod(tempoFim - tempoInicio, diaEmMinutos));

            System.out.println(tempoDeSono);
        }
    }
}
