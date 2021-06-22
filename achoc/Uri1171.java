import java.util.HashMap;
import java.util.Scanner;

public class Uri1171 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var quantidadeDeNumeros = scanner.nextInt();

        var map = new HashMap<Integer, Integer>();
        for (int i = quantidadeDeNumeros; i > 0; i--) {
            var numero = scanner.nextInt();
            if (map.containsKey(numero)) {
                var quantidade = map.get(numero);
                map.replace(numero, quantidade + 1);
            } else {
                map.put(numero, 1);
            }
        }

        map.keySet().stream()
                .sorted()
                .forEach(key -> System.out.println(key + " aparece " + map.get(key) + " vez(es)"));

    }
}
