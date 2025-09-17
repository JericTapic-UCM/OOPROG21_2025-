import javax.swing.*;

public class DemoGrosspay {

    static double rate = 22.75;

    public static void main(String[] args) {
        double hour1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours worked (1st):"));
        double hour2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours worked (2nd):"));
        double hour3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours worked (3rd):"));

                double gross1 = calculateGross(hour1);
        double gross2 = calculateGross(hour2);
        double gross3 = calculateGross(hour3);

                System.out.printf("1st hours: %.2f hours, Gross Pay: $%.2f%n", hour1, gross1);
        System.out.printf("2nd hours: %.2f hours, Gross Pay: $%.2f%n", hour2, gross2);
        System.out.printf("3rd hours: %.2f hours, Gross Pay: $%.2f%n", hour3, gross3);
    }

    static double calculateGross(double hours) {
        return hours * rate;
    }
}
