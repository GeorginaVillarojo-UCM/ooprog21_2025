import java.util.Scanner;

class BankBalanceByRateAndYe {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();


        for (double rate = 0.02; rate <= 0.05; rate += 0.01) {
            System.out.printf("%nWith an initial balance of $%.1f at an interest rate of %.2f%n", balance, rate);

            double yearlyBalance = balance;


            for (int year = 1; year <= 4; year++) {
                yearlyBalance = yearlyBalance * (1 + rate);
                System.out.printf("After year %d balance is $%.6f%n", year, yearlyBalance);
            }
        }

        input.close();
    }
}
