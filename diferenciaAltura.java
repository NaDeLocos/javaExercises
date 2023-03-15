import java.util.Scanner;

class diferenciaAltura {
    public static void main(String[] args) {

        
        
        Scanner entrada = new Scanner(System.in);
        float alturaPreter, altura, difAltura;
        String nombre;

        //establecer una altura preterminada
        System.out.println("Establece una altura mínima: ");
        alturaPreter = entrada.nextFloat();

        //poner nombre
        System.out.println("¿Cómo te llamas?: ");
        nombre = entrada.nextLine();
        nombre = entrada.nextLine();
        //altura
        System.out.println("¿Cuánto mides?:");
        altura = entrada.nextFloat();

        //Establecer diferencia de altura
        difAltura = altura - alturaPreter;
        System.out.println(nombre + ", tu diferencia de altura es de: " + difAltura + " metros.");

    }
}
