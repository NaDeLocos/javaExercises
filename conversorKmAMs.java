import java.util.Scanner;

class conversor {
    public static void main(String[] args) {
        System.out.println("Escribe los km/h: ");

        float km, ms;
        Scanner input = new Scanner(System.in);

        km = input.nextFloat();
        
        ms = km / 3600 * 1000;

        System.out.println(km + "km/h son " + ms + "m/s.");
    }
}