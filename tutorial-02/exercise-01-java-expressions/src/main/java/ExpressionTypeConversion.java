public class ExpressionTypeConversion {
        public static void main(String[] args) {

        char c = 'a';

        int x = c;

        System.out.println(x);

        x++;

        System.out.println(x);

        char v = (char) x;

        System.out.println(c);

        System.out.println(v);

        c++;

        System.out.println(c);
    }
}
