public class RefactoredPrograms {
        public static void main(String[] args) {

        int x = 10;
        int y = 5;

        if (x > y) {
            System.out.println("Good Day");
        } else {
            System.out.println("x is less than or equal to y");
            System.out.println("Good Day");
        }

        System.out.println("---");

        if (x % 2 == 0) {
            System.out.println("x is even");
            System.out.println(x);
        } else {
            System.out.println("x is odd");
            System.out.println(x);
        }
    }
}
