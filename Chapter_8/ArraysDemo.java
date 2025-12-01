import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        System.out.print("Original array:       ");
        display(numbers);

        Arrays.fill(numbers, 8);
        System.out.print("After filling with 8s: ");
        display(numbers);

        numbers[2] = 6;
        numbers[4] = 3;
        System.out.print("After changing two values: ");
        display(numbers);

        Arrays.sort(numbers);
        System.out.print("After sorting:         ");
        display(numbers);
    }

    public static void display(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }
}
