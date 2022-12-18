import java.util.Locale;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        try {
            value = printNotes(value);

            System.out.println();
            value = value * 100;

            printCoins(value);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static void printCoins(double value) {
        int result;
        System.out.println("MOEDAS: ");
        result = (int) value / 100;
        System.out.printf("%d Moeda (s) de R$ 1.00\n", result);

        value = value % 100;
        result = (int) value / 50;
        System.out.printf("%d Moeda (s) de R$ 0.50\n", result);

        value = value % 50;
        result = (int) value / 25;
        System.out.printf("%d Moeda (s) de R$ 0.25\n", result);

        value = value % 25;
        result = (int) value / 10;
        System.out.printf("%d Moeda (s) de R$ 0.10\n", result);

        value = value % 10;
        result = (int) value / 5;
        System.out.printf("%d Moeda (s) de R$ 0.05\n", result);

        value = value % 5;
        result = (int) value;
        System.out.printf("%d Moeda (s) de R$ 0.01\n", result);
    }

    private static double printNotes(double value) {
        int result;
        System.out.println("NOTAS: ");
        result = (int) value / 100;
        System.out.printf("%d Nota (s) de R$ 100.00\n", result);

        value = value % 100;
        result = (int) value / 50;
        System.out.printf("%d Nota (s) de R$ 50.00\n", result);

        value = value % 50;
        result = (int) value / 20;
        System.out.printf("%d Nota (s) de R$ 20.00\n", result);

        value = value % 20;
        result = (int) value / 10;
        System.out.printf("%d Nota (s) de R$ 10.00\n", result);

        value = value % 20;
        result = (int) value / 5;
        System.out.printf("%d Nota (s) de R$ 5.00\n", result);

        value = value % 5;
        result = (int) value / 2;
        System.out.printf("%d Nota (s) de R$ 2.00\n", result);
        value = value % 2;
        return value;
    }
}
