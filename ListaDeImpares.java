import java.util.Scanner;

public class ListaDeImpares {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("¿Hasta qué número quieres la lista de impares?: ");
        int num = scan.nextInt();
        System.out.println("Los números impares entre 0 y "+ num +" son:");

        if(num < 0){
            System.out.println("Error: no se admiten números negativos.");
            return;
        }

        for(int i = 0; i<= num; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }

    }
    
}
