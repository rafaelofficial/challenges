import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final List<Integer> input = new ArrayList<>();
        final List<Integer> evenNumber = new ArrayList<>();
        final List<Integer> oddNumber = new ArrayList<>();

        int n, k;

        System.out.println("Enter with list size: ");
        n = scanner.nextInt();

        System.out.println("Enter with target number: ");
        k = scanner.nextInt();

        scanner = getInputs(scanner, n, input, evenNumber, oddNumber);
        getNumbersEvenAndOdd(k, evenNumber, oddNumber);

        scanner.close();
    }

    private static void getNumbersEvenAndOdd(int k, List<Integer> evenNumber, List<Integer> oddNumber) {
        for (Integer even : evenNumber) {
            if (even - 1 == k) {
                System.out.println(even);
            }
        }

        for (Integer odd : oddNumber) {
            if (odd - 1 == k) {
                System.out.println(odd);
            }
        }
    }

    private static Scanner getInputs(Scanner scanner, int n, List<Integer> input, List<Integer> evenNumber, List<Integer> oddNumber) {
        System.out.println("Enter with numbers to list");
        for (int i = 0; i < n; i++) {
            scanner = new Scanner(System.in);
            input.add(scanner.nextInt());

            if (input.get(i) % 2 == 0) {
                evenNumber.add(input.get(i));
            } else {
                oddNumber.add(input.get(i));
            }
        }
        return scanner;
    }
}
