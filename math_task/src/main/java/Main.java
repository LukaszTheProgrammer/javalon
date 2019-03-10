public class Main {

    public static void main(String[] args) {
        double x1 = 2;
        double y1 = 5;
        double x2 = 5;
        double y2 = 9;

        double dx2x1 = x2 - x1;
        double dy2y1 = y2 - y1;
        double power1 = Math.pow(dx2x1, 2);
        double power2 = Math.pow(dy2y1, 2);
        double sumOfPowers = power1 + power2;
        double distance = Math.sqrt(sumOfPowers);

        double distance2 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
        System.out.println("Rozwiązanie wynosi: "+distance);
        System.out.println("Rozwiązanie wynosi: "+distance2);
    }

}
