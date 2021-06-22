import java.util.Scanner;

public class Uri1467 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();
            var c = scanner.nextInt();

            if (a == b && b == c) {
                System.out.println("*");
            } else if (a == b) {
                System.out.println("C");
            } else if (b == c) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
