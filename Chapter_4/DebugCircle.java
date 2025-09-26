import java.util.Scanner;

class DebugCircle {
    
    
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;


    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }


    public int getRadius() {
        return radius;
    }


    public int getDiameter() {
        return diameter;
    }


    public double getArea() {
        return area;
    }

          public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = input.nextInt();

        DebugCircle circle = new DebugCircle(r);

        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());

        input.close();  }

}


