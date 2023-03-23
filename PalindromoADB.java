import java.util.Scanner;

public class PalindromoADB {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        String frase = scan.nextLine();
        String fraseTransformada = "";
        for(int i = 0;i <frase.length();i++){
            if(!(frase.charAt(i) == ' ' || frase.charAt(i) == ',' || frase.charAt(i) == '.')){
                fraseTransformada = fraseTransformada + frase.charAt(i);
            }
        }
        fraseTransformada = fraseTransformada.toLowerCase();
        int j = fraseTransformada.length() - 1;
        boolean igual = true;
        for(int i = 0;i <fraseTransformada.length();i++){
            if(!(fraseTransformada.charAt(i) == fraseTransformada.charAt(j))){
                igual = false;
                break;
            }
            j--;
        }

        if(igual){
            System.out.println("La frase '" + frase + "' es palindroma");
        }else{
            System.out.println("La frase '" + frase + "' no es palindroma");
        }
    }
}
