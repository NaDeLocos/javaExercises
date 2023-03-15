import java.util.Scanner;

class datosDeUsuario {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");

        String nombre, apellido;
        Scanner input = new Scanner(System.in);

        nombre = input.nextLine();
        
        System.out.println("Escribe tus apellidos: ");

        apellido = input.nextLine();

        System.out.println("Hola " + nombre + " " + apellido);
    }
}