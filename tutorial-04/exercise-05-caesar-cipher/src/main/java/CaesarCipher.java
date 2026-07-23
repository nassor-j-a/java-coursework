import java.util.Scanner;

/**
 * Exercise 4-5
 * Caesar Cipher
 *
 * Encrypts a message by shifting each
 * alphabetic character by a given key.
 */
public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         Caesar Cipher");
        System.out.println("==================================");

        System.out.print("Please enter the message: ");
        String message = scanner.nextLine();

        System.out.print("Please enter the key: ");
        int key = scanner.nextInt();

        key %= 26;

        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {

            char c = message.charAt(i);

            if (Character.isUpperCase(c)) {

                c = (char) ((c - 'A' + key) % 26 + 'A');

            } else if (Character.isLowerCase(c)) {

                c = (char) ((c - 'a' + key) % 26 + 'a');

            }

            encrypted += c;
        }

        System.out.println("The encrypted message is:");
        System.out.println(encrypted);

        scanner.close();
    }
}