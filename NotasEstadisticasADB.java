import java.util.Scanner;

public class NotasEstadisticasADB {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuántas notas quieres introducir?: ");

        int numeroNotas = scan.nextInt();
        float[] tablaNotas = new float[numeroNotas];
        int aprobados = 0,suspensos = 0;
        float media = 0;

        for(int i = 0; i < numeroNotas;i++){
            System.out.print("nota "+(i + 1)+": ");
            float nota = scan.nextFloat();
            while(!esValida(nota)){
                System.out.print("nota "+(i + 1)+": ");
                nota = scan.nextFloat();
            }
            tablaNotas[i] = nota;
            if(nota >= 5){aprobados++;}else{suspensos++;}
            media += nota;
        }

        System.out.println("-----------------------------");
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Media de notas: " + media/numeroNotas);
        System.out.println("-----------------------------");


    }

    private static boolean esValida(float num){

        if(num >= 0 && num <= 10){
            return true;
        }

        return false;
    }
    
}
