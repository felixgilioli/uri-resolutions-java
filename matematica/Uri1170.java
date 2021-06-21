import java.util.Locale;
import java.util.Scanner;

public class Uri1170 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        var n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            var quantidadeComidaDisponivel = scanner.nextDouble();

            var quantidadeDeDiasAteComerTodaComida = getQuantidadeDeDiasAteComerTodaComida(quantidadeComidaDisponivel, 0);

            System.out.println(quantidadeDeDiasAteComerTodaComida + " dias");
        }
    }

    private static int getQuantidadeDeDiasAteComerTodaComida(double quantidadeComida, int quantidadeDias) {
        if (quantidadeComida <= 1.0) {
            return quantidadeDias;
        }

        return getQuantidadeDeDiasAteComerTodaComida(quantidadeComida / 2, quantidadeDias + 1);
    }
}
