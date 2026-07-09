import java.util.*;

public class Zodiac {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("          Zodiac Sign");
        System.out.println("==================================");

        System.out.print("Enter birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter birth day: ");
        int day = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            scanner.close();
            return;
        }

        int maxDay;

        switch (month) {
            case 2:
                maxDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            default:
                maxDay = 31;
        }

        if (day < 1 || day > maxDay) {
            System.out.println("Invalid day for the selected month.");
            scanner.close();
            return;
        }

        String zodiac = switch (month) {
            case 1 -> (day <= 19) ? "Capricorn" : "Aquarius";
            case 2 -> (day <= 17) ? "Aquarius" : "Pisces";
            case 3 -> (day <= 19) ? "Pisces" : "Aries";
            case 4 -> (day <= 19) ? "Aries" : "Taurus";
            case 5 -> (day <= 20) ? "Taurus" : "Gemini";
            case 6 -> (day <= 20) ? "Gemini" : "Cancer";
            case 7 -> (day <= 22) ? "Cancer" : "Leo";
            case 8 -> (day <= 22) ? "Leo" : "Virgo";
            case 9 -> (day <= 22) ? "Virgo" : "Libra";
            case 10 -> (day <= 22) ? "Libra" : "Scorpio";
            case 11 -> (day <= 21) ? "Scorpio" : "Sagittarius";
            case 12 -> (day <= 21) ? "Sagittarius" : "Capricorn";
            default -> "";
        };

        System.out.println();
        System.out.println("Zodiac Sign: " + zodiac);

        scanner.close();
    }
}
