import java.util.Scanner;
class edadFutura {

    public static void main(String[] args) {

    int edad;
    String nombre;
    Scanner entrada = new Scanner(System.in);

    //introducir nombre
    System.out.print("\n¿Cómo te llamas? ");
    nombre = entrada.nextLine();

    //introducir edad
    System.out.print("\n¿Cuántos años tienes? ");
    edad = entrada.nextInt();


    //imprimir resultados
    System.out.println("\n" + nombre + ", dentro de 5 años tendras: " + (edad + 5) + " años.");

    }
}