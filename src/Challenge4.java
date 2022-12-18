import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter with total of phrases: ");
        int n = scanner.nextInt();

        System.out.println("Enter with your phrases: ");
        for (int i = 0; i < n; i++) {
            scanner = new Scanner(System.in);
            String words = scanner.nextLine();

            reversePhrases(words);
        }

        scanner.close();
    }

    private static void reversePhrases(String words) {
        final String partOne = words.substring(0, words.length() / 2);
        final String partTwo = words.substring(words.length() / 2);

        String reverseOne = reverse(partOne);
        String reverseTwo = reverse(partTwo);

        System.out.println(reverseOne.toUpperCase() + reverseTwo.toUpperCase());
    }

    public static String reverse(String string) {
        final StringBuilder builder = new StringBuilder(string);
        builder.reverse().append(" ");

        return builder.toString().trim();
    }
}
