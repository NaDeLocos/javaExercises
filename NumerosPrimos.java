import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Escribe un número para comprobar si es primo: ");

        int num = scan.nextInt();

        if(esPrimo(num)){
            System.out.println("El número " + num + " es primo.");
        }else{
            System.out.println("El número " + num + " no es primo.");
        }


    }

    private static boolean esPrimo(int num){

        for(int i = 2;i < num;i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }
    
}
