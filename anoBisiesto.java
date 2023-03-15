import java.util.Scanner;

class anoBisiesto{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Dame el año: ");
        int ano = scan.nextInt();

        if((ano%4 == 0 && !(ano%100 == 0)) || (ano%4==0 && ano%100==0 && ano%4==0))
        {
            System.out.println(ano + " es un año bisiestro.");
        }else{
            System.out.println(ano + " no es un año bisiestro.");
        }
        
    }
}