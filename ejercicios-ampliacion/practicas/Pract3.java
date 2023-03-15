package practicas;

import util.*;

import java.util.Scanner;

public class Pract3 extends Practica{

    Scanner scaner = new Scanner(System.in);
    static String[] dias = {"Lunes","Matres","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    int diaIntroducido = 50;

    public void init() {
        
        
        int clave = -1;
        while(clave == -1){
            Comentario.print(CColor.BLUE,"\n\nIntroduce un número entre 1 y 7 incluidos: ");

            diaIntroducido = scaner.nextInt();
            

            if(diaIntroducido >= 1 && diaIntroducido <= 7){
                diaIntroducido = diaIntroducido - 1;
                clave = 1;
            }

            if(clave == -1){
                Comentario.print(CColor.RED,"\nNúmero mal escrito o incorrecto,intenta de nuevo:");
            }
        }

        String dia = dias[diaIntroducido];

        Comentario.print(CColor.GREEN,"\n",
            "________________________________________\n","\n",
            CColor.BLUE,"El día correspondiente es ", dia ,"!!.",
            CColor.GREEN,"\n________________________________________\n"
        );


        Tiempo.pausar();
    }

    
}
