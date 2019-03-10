import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać wyrażenie do obliczenia");
        double a1 = Double.parseDouble(scanner.nextLine());
        String operacja = scanner.nextLine();
        double a2 = Double.parseDouble(scanner.nextLine());
        if (operacja.equals("+")) {
            System.out.println(a1 + a2);
        } else if (operacja.equals("-")) {
            System.out.println(a1 - a2);
        } else if (operacja.equals("*")) {
            System.out.println(a1 * a2);
        } else {
            System.out.println("Nieobsługiwana operacja: " + operacja);
        }
        // 2.4 + 3.5
        // 3.4 * 1.1
        // 3.4 - 1.2
    }
}
