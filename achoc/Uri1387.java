import java.util.Scanner;

public class Uri1387 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }
    }

}
