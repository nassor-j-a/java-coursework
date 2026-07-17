import java.util.Scanner;

/**
 * Exercise 3-14
 * Letter Grades
 *
 * Determines a student's letter grade
 * based on their marks.
 */
public class LetterGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        Letter Grade Calculator");
        System.out.println("==================================");

        System.out.print("Enter student's marks (0-105): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 105) {

            System.out.println("Invalid marks entered!");

        } else if (marks >= 85) {

            System.out.println("Your grade is A");

        } else if (marks >= 74) {

            System.out.println("Your grade is B");

        } else if (marks >= 60) {

            System.out.println("Your grade is C");

        } else if (marks >= 50) {

            System.out.println("Your grade is D");

        } else {

            System.out.println("Your grade is F");

        }

        // // Opt 2: Calcutating student's grade

        // if (marks >= 0 && marks <= 105) {

        //     String grade = (marks >= 85) ? "A" : (marks >= 74) ? "B" : (marks >= 60) ? "C" : (marks >= 50) ? "D" : "F";

        //     System.out.println("Your grade is " + grade);

        // } else {

        //     System.out.println("Invalid marks entered!");

        // }

        scanner.close();
    }
}