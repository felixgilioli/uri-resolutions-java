import java.util.Scanner;

public class Uri1013 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        int maior = getMaior(c, getMaior(a, b));
        System.out.println(maior + " eh o maior");
    }

    private static int getMaior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
}
