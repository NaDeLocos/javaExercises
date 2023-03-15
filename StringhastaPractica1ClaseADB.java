//EJEMPLO 1
/* import java.util.Scanner;
public class StringhastaPractica1ClaseADB {
    public static void main(String[] args) {
        String palabra;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Palabra con 'a' en la segunda posición: ");
            palabra = entrada.nextLine();
        } while (palabra.length() < 2 || palabra.toLowerCase().charAt(1) != 'a');

        entrada.close();
    }
} */

//EJEMPLO 2
/* import java.util.Scanner;
public class StringhastaPractica1ClaseADB {
    public static void main(String[] args) {
    int contador = 0;
    char letra;
    String frase;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escribe una frase: ");
    frase = entrada.nextLine();
    
    System.out.print("Intenta adivinar una letra de la frase: ");
    letra = entrada.nextLine().charAt(0);

    for (int i = 0; i<frase.length(); i++) {
        if (frase.charAt(i) == letra){
            contador++;
        }
    }

    if (contador == 0) {
        System.out.println("La letra " + letra + " no está en la frase: " + frase);
    } else {
        System.out.println("La letra " + letra + " aparece " + contador + " veces en la frase: " + frase);
    }
    }
} */

// EJEMPLO 3
/* import java.util.Scanner;
public class StringhastaPractica1ClaseADB {
    public static void main(String[] args) {
    char letra;
    String frase;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escribe una frase: ");
    frase = entrada.nextLine();
    
    System.out.print("Intenta adivinar una letra de la frase: ");
    letra = entrada.nextLine().charAt(0);

    for (int i = 0; i<frase.length(); i++) {
        if (frase.toLowerCase().charAt(i) == letra) {
            System.out.print(frase.charAt(i) + " ");
        } else if (frase.charAt(i) == ' ') {
            System.out.print(" ");
        } else {
            System.out.print("_");
        }

    }
    }   
} */
    