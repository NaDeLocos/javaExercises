import java.util.Scanner;

public class CalculadoraSimpleADB {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("\n\nMENU");
        System.out.println("================================");
        System.out.println("1.- Sumar.");
        System.out.println("2.- Restar.");
        System.out.println("0.- Salir.");
        System.out.print("Elige una opción: ");

        int opcion = scan.nextInt();
        while(!(opcion >= 0 && opcion <= 2)){
            System.out.println("Incorrecto, introduce de nuevo: ");
            opcion = scan.nextInt();
        }

        if(opcion == 1){
            System.out.print("Introduce el primer número a sumar: ");
        }else if(opcion == 2){
            System.out.print("Introduce el primer número a restar: ");
        }else{
            System.out.println("\nprograma terminado.\n");
            return;
        }
        long num1 = scan.nextLong();

        System.out.print("Introduce el segundo número: ");

        long num2 = scan.nextLong();
        
        System.out.println("\n" + "---------------------------------------------------");

        if(opcion == 1){
            System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
        }else if(opcion == 2){
            System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
        }

        System.out.println("\n---------------------------------------------------"); 

        main(args);
    }
    
}
