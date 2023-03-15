import java.util.Scanner;

class conversor {
    public static void main(String[] args) {

        /*
        __________________________________________________________
        |                                                        |
        |  En esta practica mezclo las ultimas 2 practicas. :)   |
        |                                                        |
        |________________________________________________________|
        */                                                    

        Scanner input = new Scanner(System.in);

        float[] notas = new float[10];
        float notaMedia = 0;

        //obtener los datos de las notas
        for(int i = 0; i < 10; i++){
            System.out.println("escribe tu nota " + (i+1) + ":");
            notas[i] = input.nextFloat();
        }

        //sumar las notas
        for(int i = 0; i < 10; i++){
            notaMedia = notaMedia + notas[i];
        }

        //calcular media y mostrarla
        notaMedia = notaMedia / notas.length;

        System.out.println("Tu nota media es: " + notaMedia);

    }
}