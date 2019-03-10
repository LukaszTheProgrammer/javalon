public class Main {

    public static void main(String[] args) {
        String s = "napis";
        if (s.isEmpty()) {
            System.out.println("string jest pusty");
        } else if (s.length() == 3) {
            System.out.println("długość to 3");
        } else if (s.length() > 3 && s.length() < 8) {
            System.out.println("długość mieści się między 3 a 8");
        } else {
            System.out.println("długość jest większa bądź równa 8 lub mniejsze od 3");
        }

        System.out.println("Jest godzina 14:33");
    }
}
