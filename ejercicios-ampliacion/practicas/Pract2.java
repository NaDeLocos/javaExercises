package practicas;

import util.*;

import java.util.Scanner;

public class Pract2 extends Practica{

    Scanner scaner = new Scanner(System.in);

    public void init() {
        
        Integer horaIntroducida = 50;

        int clave = -1;
        while(clave == -1){
            Comentario.print(CColor.BLUE,"\n\nIntroduce una hora exacta sin minutos(XX:--): ");
            horaIntroducida = scaner.nextInt();
            
            
            if(horaIntroducida >= 0 && horaIntroducida <= 24){
                clave = 1;
            }

            if(clave==-1){
                Comentario.print(CColor.RED,"\nIncorrecto, intentalo otra vez;");
            }
        }

        diaMedioONoche(horaIntroducida);

        Tiempo.pausar();
        
    }
    

    private static void diaMedioONoche(int hora){

        Comentario.print(CColor.GREEN,"\n","________________________________________\n");

        if(hora >= 6 && hora <= 12){
            Comentario.print(CColor.BLUE,"\n Buenos días!!");
            Comentario.print(CColor.GREEN,"\n","________________________________________");
            return;
        }

        if(hora >= 13 && hora <= 20){
            Comentario.print(CColor.BLUE,"\n Buenas tardes!!");
            Comentario.print(CColor.GREEN,"\n","________________________________________");
            return;
        }

        //no hace falta poner if porque la unica opcion que queda es la de buenas noches. 
        Comentario.print(CColor.BLUE,"\n Buenas noches!!");

        Comentario.print(CColor.GREEN,"\n","________________________________________");
    }

}
