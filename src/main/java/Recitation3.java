import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = scan.nextDouble();
        System.out.println("Enter y: ");
        double y = scan.nextDouble();

        Point location = new Point(x, y);
        Circle aCircle = new Circle(location, 16.0);

        Circle bCircle = new Circle(new Point(14,12),40.0);

        if (aCircle.intersects(bCircle)){
            System.out.println("Circles intersect!");
        } else {
            System.out.println("Circles do not intersect!");
        }


    }
}
