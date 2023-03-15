import java.util.Scanner;

public class ListaDeFactorialesADB {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = -1;
        
        while(num <= 0){
            System.out.print("Dame un número mayor que 0:");
            num = scan.nextInt();
        }

        long factorial = 1;
        System.out.println("0! = 1");
        for(int i = 1;i <= num; i++){
            factorial = factorial * i;
            System.out.println(i + "! = " + factorial);
        }
        
    }

}
