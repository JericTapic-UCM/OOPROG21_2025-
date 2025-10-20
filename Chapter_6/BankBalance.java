import javax.swing.JOptionPane;

public class BankBalance {
    public static void main(String[] args) {
        double balance;
        double interestRate = 0.03; 
        int year = 0;
        int choice;

              String input = JOptionPane.showInputDialog("Enter initial bank balance:");
        balance = Double.parseDouble(input);

        do {
            String message = "Do you want to see next year's balance?\n"
                    + "Enter 1 for yes or any other number for no:";
            choice = Integer.parseInt(JOptionPane.showInputDialog(message));

            if (choice == 1) {
                year++;
                balance = balance + (balance * interestRate);
                JOptionPane.showMessageDialog(null,
                        String.format("After year %d at %.2f interest rate, balance is $%.2f",
                                year, interestRate, balance));
            }

        } while (choice == 1);

        JOptionPane.showMessageDialog(null, "Operation complete. Program ended.");
        System.exit(0);
    }
}
