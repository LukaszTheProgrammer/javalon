public class Main {

    public static void main(String[] args) {
        String s1 = "Napis1";
        String s2 = "Napis1";
        String s3 = new String("Napis1");

        s3 = s1 + "cos";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1+" "+s3);
        System.out.println(s1+(124+6));  //"Napis1" + "124" + "6";
        System.out.println(100+20+s1);
    }
}
