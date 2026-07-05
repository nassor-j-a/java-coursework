public class ExpressionG {

    public static void main(String[] args) {

        byte x = 8;

        // Original
        // x = x + 1;

        x = (byte) (x + 1);

        System.out.println(x);
    }
}