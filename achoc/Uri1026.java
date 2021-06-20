import java.util.Scanner;

public class Uri1026 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            var a = scanner.nextLong();
            var b = scanner.nextLong();

            System.out.println(a ^ b);
        }
    }
}
