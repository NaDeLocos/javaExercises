import java.util.Scanner;

class numeroParImpar {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe tu número: ");
        n = input.nextInt();

        if(n%2 == 0){
            System.out.println("El número " + n + " es par.");
        }else{
            System.out.println("El número " + n + " es impar.");
        }
    }
}