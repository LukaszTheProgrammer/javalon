import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać coś z klawiatury");
        String input = scanner.nextLine();
        System.out.println("Wpisano:" + input);
    }
}
