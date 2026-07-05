public class ExpressionD {

    public static void main(String[] args) {

        try {

            int result = 1 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println(e);
        }
    }
}