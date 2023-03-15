package util;

import java.util.Scanner;

@SuppressWarnings({"unused"})

public class ElegirNumero {

    static Scanner scaner = new Scanner(System.in);

    public static int insertarNumero(String comentario, int rangoDeNumeros){

        Comentario.print(CColor.BLUE,"\n","siguiente(enter)...");
        scaner.nextLine();
        Comentario.print(CColor.BLUE,"\n",comentario);
        int numeroElegido;
        numeroElegido = scaner.nextInt();

        

        if(numeroEquivalente(rangoDeNumeros, numeroElegido)){
            Comentario.print("\n",
                CColor.GREEN,"\nNumero elegido es el ", numeroElegido, ".\n"
            );
            return numeroElegido;
        }else{

            Comentario.print(CColor.RED, "\nNúmero incorrecto, intentalo de nuevo: ");
            return insertarNumero(comentario,rangoDeNumeros);
        }

    }

    private static boolean numeroEquivalente(int rango, int numero){

        for(int i = 1;i <= rango; i++){
            if (i == numero) {
                return true;
            }
        }

        return false;
    }
    
}
