import java.util.Scanner;

public class NotaNumericaATexto{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Escribe la nota: ");
        float nota = scan.nextFloat();
        String escritura = "n/a";

        if(nota > 0 && nota < 5){
            escritura = "INSUFICIENTE";
        }else if(nota >= 5 && nota < 6){
            escritura = "SUFICIENTE";
        }else if(nota >= 6 && nota < 7){
            escritura = "BIEN";
        }else if(nota >= 7 && nota < 9){
            escritura = "NOTABLE";
        }else if(nota >= 9 && nota <= 10){
            escritura = "SOBRESALIENTE";
        }else{
            escritura = "Hermano, no sé que es eso pero desde luego que no es una nota normal y corriente AJAJJAJAAJJAJA.";
        }


        System.out.print("Nota: " + escritura + "\n");

    }
}