import java.util.Scanner;

public class Uri1329 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            var numeroDeJogadas = scanner.nextInt();
            if (numeroDeJogadas == 0) {
                break;
            }

            int quantidadeVitoriasMaria = 0;
            int quantidadeVitoriasJoao = 0;
            for (int i = 0; i < numeroDeJogadas; i++) {
                if (scanner.nextInt() == 0) {
                    quantidadeVitoriasMaria++;
                } else {
                    quantidadeVitoriasJoao++;
                }
            }

            System.out.printf("Mary won %s times and John won %s times%n", quantidadeVitoriasMaria, quantidadeVitoriasJoao);
        }
    }
}
