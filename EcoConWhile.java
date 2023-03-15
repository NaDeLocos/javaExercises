import java.util.Scanner;

public class EcoConWhile {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe todo lo que quieras (“salir” para terminar)... Empieza cuando quieras.");

        String input = "n/a";

        while(!input.equals("salir")){
            input = scan.nextLine();
            if(!input.equals("salir")){
                System.out.println(input);
            }
        }

        System.out.println("Adiousssssssss.");

    }

}
