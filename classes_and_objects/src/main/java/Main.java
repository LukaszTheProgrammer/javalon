class Punkt {

    int x;
    int y;

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
        Punkt punkt = new Punkt(5, 6);
        System.out.println(punkt.x + " " + punkt.y);

        Punkt punkt2 = new Punkt(1, 2);
        System.out.println(punkt2.x + " " + punkt2.y);

        double distance = distance(punkt, punkt2);
        System.out.println(distance);
    }

    private static double distance(Punkt p1, Punkt p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
