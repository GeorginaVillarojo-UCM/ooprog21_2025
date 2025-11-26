import java.util.Scanner;

class CompareStrings {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String name = input.nextLine();

        if (name.equals("Carmen")) {
            System.out.println(name + " equals Carmen");
        } else {
            System.out.println(name + " does not equal Carmen");
        }

        input.close();
    }
}
