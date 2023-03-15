package util;

import java.util.Scanner;

public class Tiempo {
    static Scanner scaner = new Scanner(System.in);

    public static void pausar(){
        Comentario.print(CColor.BLUE,"\n\n","siguiente(presiona enter)...");
        scaner.nextLine();
    }

}
