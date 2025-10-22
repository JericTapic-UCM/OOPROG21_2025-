
import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03;
        int year = 1;
        char choice;

        System.out.print("Enter initial bank balance: ");
        balance = input.nextDouble();

        do {
            double interest = balance * INTEREST_RATE;
            balance += interest;

            System.out.printf("Year %d: Balance = %.2f (Interest earned: %.2f)%n", year, balance, interest);

            System.out.print("Do you want to continue to the next year? (Y/N): ");
            choice = input.next().charAt(0);

            year++;
        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nFinal Balance: " + String.format("%.2f", balance));
        System.out.println("Thank you for using Bank Balance Calculator!");

        input.close();
    }
}
```
