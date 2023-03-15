import java.util.Scanner;

public class EstadisticasVocalesADB {
    
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        String frase = scan.nextLine();
        String fraseTransformada = frase.toLowerCase();

        System.out.println("Estadísticas: ");
        
        char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
        int[] cantidades = new int[5];
        
        for(int i = 1;i <= 5;i ++){
            for(int j = 1;j <= frase.length();j ++){
                if(fraseTransformada.charAt(j-1) == vocales[i-1] || fraseTransformada.charAt(j-1) == vocales[i-1 + 5]){
                    cantidades[i-1]++;
                }
            }
        }
        
        for(int i = 1;i <= 5;i ++){
            System.out.println("Número de " + vocales[i-1] + ": " + cantidades[i-1]);
        }
        
    }

}
