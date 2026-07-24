import java.util.Scanner;

/**
 * Exercise 4-6
 * String Manipulation I
 *
 * Counts vowels, consonants,
 * punctuation characters,
 * and spaces in a line of text.
 */
public class StringManipulationI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     String Manipulation I");
        System.out.println("==================================");

        System.out.print("Please enter a line of text: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            switch (ch) {

                case 'a', 'e', 'i', 'o', 'u' -> vowels++;

                case '.', ',', '!', '?', ';', ':',
                     '-', '(', ')', '"', '\'',
                     '[', ']', '{', '}' -> punctuation++;

                case ' ' -> spaces++;

                default -> {

                    if (ch >= 'a' && ch <= 'z') {
                        consonants++;
                    }

                }

            }

        }

        System.out.println();
        System.out.println("Analysis Results");
        System.out.println("----------------");
        System.out.println("Consonants : " + consonants);
        System.out.println("Vowels     : " + vowels);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces     : " + spaces);

        scanner.close();
    }
}