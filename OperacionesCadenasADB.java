import java.util.Scanner;

public class OperacionesCadenasADB {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        String frase = scan.nextLine();
        String fraseTransformada = frase.toLowerCase();
        System.out.println("MENÚ:\n====================================\n1.- Contar palabras.\n2.- Iniciales.\n3.- Sustituir carácter.\n4.- Al revés.\n0.- Salir.");

        
        int num = -1;
        while(num < 0 || num > 4){
            System.out.println("Elige una opción: ");
            num = scan.nextInt();
        }

        System.out.println("SIU");
        
        
    }
}
