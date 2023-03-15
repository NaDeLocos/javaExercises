import java.util.Scanner;

class division {
    public static void main(String[] args) {

    int n1,n2;
    Scanner entrada = new Scanner(System.in);


    //recolección de números:
    System.out.println("Dame un número entero:");
    n1 = entrada.nextInt();
    System.out.println("Dame otro número entero:");
    n2 = entrada.nextInt();

    //resultados:
    System.out.println("--------------------------------------------");

    System.out.println("Resultado entero:" + ((int) n1/n2));
    System.out.println("Resto de la división entera:" + (n1%n2));

    String exacta = (n1%n2) == 0 ? "verdadero" : "falso"; 

    System.out.println("¿Es exacta?: " + exacta);
    System.out.println("Resultado real:" + ((float) n1/n2));



    System.out.println("--------------------------------------------");

    }
}