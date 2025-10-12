public class Employee {
    private double payRate;
    private static final double OVERTIME_RATE = 1.5;

    public Employee(double payRate) {
        this.payRate = payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double computeOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_RATE;
        } else {
            return 0.0;
        }
    }
}
