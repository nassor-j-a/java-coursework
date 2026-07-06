import java.util.Scanner;

public class BoilingTime {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter diameter (m): ");
        double diameter = scanner.nextDouble();

        System.out.print("Enter water height (m): ");
        double height = scanner.nextDouble();

        double radius = diameter / 2.0;

        double volume = Math.PI * radius * radius * height;

        double litres = volume * 1000;

        double time = litres * 2;

        System.out.println("Time to boil (minutes): " + time);

        scanner.close();
    }
}
