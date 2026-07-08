import java.util.*;

public class CartesianPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       Cartesian Plane");
        System.out.println("==================================");

        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();

        System.out.println();

        if (x == 0 && y == 0) {

            System.out.println("The point is at the Origin.");

        } else if (x == 0) {

            System.out.println("The point lies on the Y-axis.");

        } else if (y == 0) {

            System.out.println("The point lies on the X-axis.");

        } else if (x > 0 && y > 0) {

            System.out.println("The point is located in Quadrant I.");

        } else if (x < 0 && y > 0) {

            System.out.println("The point is located in Quadrant II.");

        } else if (x < 0 && y < 0) {

            System.out.println("The point is located in Quadrant III.");

        } else {

            System.out.println("The point is located in Quadrant IV.");

        }

        scanner.close();
        
    }

}
