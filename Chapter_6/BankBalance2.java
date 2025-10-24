import java.util.Scanner;

class BankBalance {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00;     
        double interestRate = 0.03;   
        int year = 1;
        int response;


        do {
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("    or any other number for no >> ");
            response = input.nextInt();
            System.out.println();

            if (response == 1) {

                balance = balance + (balance * interestRate);
                year++;

                System.out.printf("After year %d at %.2f  interest rate, balance is $%.4f%n%n",
                        year, interestRate, balance);
            }

        } while (response == 1);
    }
}
