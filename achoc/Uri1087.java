import java.util.Scanner;

public class Uri1087 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            var linhaInicio = scanner.nextInt();
            var colunaInicio = scanner.nextInt();
            var linhaFim = scanner.nextInt();
            var colunaFim = scanner.nextInt();

            if (linhaInicio == 0 && colunaInicio == 0 && linhaFim == 0 && colunaFim == 0) {
                break;
            }

            if (linhaInicio == linhaFim && colunaInicio == colunaFim) {
                System.out.println(0);
                continue;
            }

            if (linhaInicio == linhaFim || colunaInicio == colunaFim) {
                System.out.println(1);
                continue;
            }

            var diferencaLinhas = Math.abs(linhaFim - linhaInicio);
            var diferencaColunas = Math.abs(colunaFim - colunaInicio);

            if (diferencaLinhas == diferencaColunas) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
