import java.util.Scanner;

public class CuentaCaracteresADB {
    
    public static void main(String[] arg){

        /*
         * 
         * NO UTILIZAR VOCALES CON CARÁCTERES ESPECIALES COMO ENTRADA DE BÚSQUEDA
         * 
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        String frase = scan.nextLine();
        String fraseTransformada = frase.toLowerCase();

        System.out.print("Dame una carácter: ");
        char caracter = scan.nextLine().charAt(0);
        char caracterTransformado = Character.toLowerCase(caracter);
        int numeroDeSalidas = 0;

        char[] caracteresEspeciales = new char[]{'a','e','i','u','o','á','é','í','ú','ó'};
        boolean esVocal = false;
        int posicionDelCaracter = 0;
        for(char j:caracteresEspeciales){
            if(caracterTransformado == j){
                esVocal = true;
                break;
            }
            posicionDelCaracter = posicionDelCaracter + 1;
        }
        System.out.print(esVocal);
        if(esVocal){
            for(int i = 1;i <= frase.length();i ++){
                if(fraseTransformada.charAt(i-1) == caracter || fraseTransformada.charAt(i-1) == caracteresEspeciales[posicionDelCaracter + 5]){
                    numeroDeSalidas++;
                }
            }
        }else{
            for(int i = 1;i <= frase.length();i ++){
                if(fraseTransformada.charAt(i-1) == caracterTransformado){
                    numeroDeSalidas++;
                }
            }
        }
        
        
        System.out.println("Número de veces que aparece el carácter " + caracter + ": " + numeroDeSalidas);
    }

}
