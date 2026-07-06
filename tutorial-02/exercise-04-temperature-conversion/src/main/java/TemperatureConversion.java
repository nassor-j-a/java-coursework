import java.util.Scanner;

public class TemperatureConversion {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Celsius temperature: ");
        double c = scanner.nextDouble();

        double f = (9.0 / 5.0) * c + 32;
        double k = c + 273;

        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);

        scanner.close();
    }
}
