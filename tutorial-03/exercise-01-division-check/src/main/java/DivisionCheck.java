import java.util.*;

public class DivisionCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.print("Number is Zero");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.print("Number is divisble by both 3 and 5!");
        } else {
            System.out.print("Number is not divisble by both 3 and 5!");
        }

        scanner.close();
    }
}
