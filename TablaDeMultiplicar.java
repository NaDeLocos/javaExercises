import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Qué tabla de multiplicar quiere repasar? La tabla del: ");

        int num = scan.nextInt();

        multiplicar(num);


    }

    private static void multiplicar(int num){

        for(int i = 0;i < 11;i++){
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }
    
}
