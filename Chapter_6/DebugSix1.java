import java.util.Scanner;

class DebugSix1 {
    public static void main(String[] a) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of days >> ");
        int days = keyboard.nextInt();

        double money = 0.01;
        int day = 1;

        while (day <= days) {
            System.out.println("After day " + day + " you have $" + money);
            money = money * 2;
            day++;
        }
    }
}
