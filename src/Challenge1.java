import java.util.Arrays;

public class Challenge1 {
    public static void main(String[] args) {

        int[] array = new int[]{10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98};
        
        for (int evenNumbers = 1; evenNumbers < array.length; evenNumbers++) {
            if (array[evenNumbers] % 2 == 0) {
                System.out.println(array[evenNumbers]);
            }
            Arrays.sort(array);
        }

        for (int oddNumber = array.length - 1; oddNumber >= 0; oddNumber--) {
            if (array[oddNumber] % 3 == 0 && array[oddNumber] % 2 != 0) {
                System.out.println(array[oddNumber]);
            }
        }
    }
}
