import java.util.Scanner;

public class Uri1028 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numberOfTests = scanner.nextInt();

        for (var i = 0; i < numberOfTests; i++) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();

            var maior = Math.max(a, b);
            var menor = Math.min(a, b);

            int mdc;
            int resto;
            do {
                resto = maior % menor;

                mdc = menor;

                maior = menor;
                menor = resto;
            } while (resto > 0);

            System.out.println(mdc);
        }

    }
}
