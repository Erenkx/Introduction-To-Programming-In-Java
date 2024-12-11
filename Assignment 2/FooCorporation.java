public class FooCorporation {

    public static void calculateSalary(double basePay, int hoursWorked) {
        if (basePay < 8.0) {
            System.err.println("Error: Hourly employees must be paid " +
                "at least $8.00 an hour.");
        } else if (hoursWorked > 60) {
            System.err.println("Error: Hourly employees are not allowed " +
                "to work more than 60 hours in a week.");
        } else if (hoursWorked > 40) {
            System.out.printf("The total pay is $%.2f.\n",
                1.5 * basePay * (hoursWorked - 40) + basePay * 40);
        } else {
            System.out.printf("The total pay is $%.2f.\n",
                basePay * hoursWorked);
        }
    }

    public static void main(String[] args) {
        // base pay for each employee
        final double basePay1 = 7.50;
        final double basePay2 = 8.20;
        final double basePay3 = 10.00;
        final double basePay4 = 8.50;

        // hours worked for each employee
        final int hoursWorked1 = 35;
        final int hoursWorked2 = 47;
        final int hoursWorked3 = 73;
        final int hoursWorked4 = 30;

        System.out.printf("Employee 1: Base Pay = $%.2f, " +
                "Hours Worked = %d\n", basePay1, hoursWorked1);
        calculateSalary(basePay1, hoursWorked1);

        System.out.println();

        System.out.printf("Employee 2: Base Pay = $%.2f, " +
                "Hours Worked = %d\n", basePay2, hoursWorked2);
        calculateSalary(basePay2, hoursWorked2);

        System.out.println();

        System.out.printf("Employee 3: Base Pay = $%.2f, " +
                "Hours Worked = %d\n", basePay3, hoursWorked3);
        calculateSalary(basePay3, hoursWorked3);

        System.out.println();

        System.out.printf("Employee 4: Base Pay = $%.2f, " +
                "Hours Worked = %d\n", basePay4, hoursWorked4);
        calculateSalary(basePay4, hoursWorked4);
    }

}