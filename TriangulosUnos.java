import java.util.Scanner;

public class TriangulosUnos {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Indica la altura, en filas, del triángulo: ");

        int num = scan.nextInt();

        dibujarArbol(num);


    }

    private static void dibujarArbol(int num){
        String arbol = "";
        for(int i = 0;i < num;i++){
            arbol = arbol + "1";
            System.out.println(arbol);
        }
    }
    
}
