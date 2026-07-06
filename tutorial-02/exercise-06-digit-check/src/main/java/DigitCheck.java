import java.util.Scanner;

public class DigitCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3-digit number: ");
        int n = scanner.nextInt();

        int middle = (n / 10) % 10;

        System.out.println("Middle digit: " + middle);

        if (middle % 2 == 0) {
            System.out.println("Middle digit is even");
        } else {
            System.out.println("Middle digit is odd");
        }

        scanner.close();
    }
}
