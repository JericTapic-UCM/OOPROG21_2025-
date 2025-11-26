import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String predefined = "Carmen";
        System.out.print("Enter your name > ");
        String input = kb.nextLine();

        if (input.equals(predefined)) {
            System.out.println("Carmen equals " + input);
        } else {
            System.out.println("Carmen does not equal " + input);
        }
    }
}
