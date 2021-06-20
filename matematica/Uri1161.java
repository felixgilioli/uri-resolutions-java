import java.util.Scanner;

public class Uri1161 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();

            long total = fatorial(a, a) + fatorial(b, b);

            System.out.println(total);
        }
    }

    private static long fatorial(int x, long total) { // x=1, total=24
        if (x > 1) {
            return fatorial(x - 1, total * (x - 1));
        }

        if (x == 1) {
            return total;
        } else {
            return 1;
        }
    }
}
