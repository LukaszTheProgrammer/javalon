
public class Main {

    public static void main(String[] args) {
        double pole = poleProstokąta(2,5);
        System.out.println(pole);

        int dlugosc = dlugoscNapisu("Jakiś napis");
        int dlugosc1 = "Java".length();
        System.out.println(dlugosc);

        boolean is14AtLeastCharsLong = isAtleastCharsLong("Napis", 14);
        boolean is5AtLeastCharsLong = isAtleastCharsLong("Napis", 5);

    }


    static boolean isAtleastCharsLong(String napis, int charLength){
        return napis.length() >= charLength;
    }

    static int dlugoscNapisu(String napis){
        return napis.length();
    }

    static double poleProstokąta(double a, double b){
        return a * b;
    }
}
