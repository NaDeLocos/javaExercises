import java.util.Scanner;

public class NotaAmericana{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Escribe la nota: ");
        float nota = scan.nextFloat();
        String escritura = "n/a";

        if(nota > 0 && nota <= 59){
            escritura = "F";
        }else if(nota >= 60 && nota <= 69){
            escritura = "D";
        }else if(nota >= 70 && nota <= 79){
            escritura = "C";
        }else if(nota >= 80 && nota <= 89){
            escritura = "B";
        }else if(nota >= 90 && nota <= 100){
            escritura = "A";
        }else{
            escritura = "Hermano, no sé que es eso pero desde luego que no es una nota normal y corriente AJAJJAJAAJJAJA.";
        }


        System.out.print("Nota: " + escritura + "\n");

    }
}