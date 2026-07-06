public class RandomCard {
        public static void main(String[] args) {

        int card = (int)(Math.random() * 1000) + 1;

        System.out.println("Selected card: " + card);
    }
}
