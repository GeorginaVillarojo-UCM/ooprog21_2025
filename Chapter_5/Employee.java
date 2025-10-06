class Employee {
    private int employeeNumber;
    private double payRate;
    private final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > 9999)
            this.employeeNumber = 9999;
        else
            this.employeeNumber = employeeNumber;
            this.payRate = payRate;
    }

    public double getRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }
}
