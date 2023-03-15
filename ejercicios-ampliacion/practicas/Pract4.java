package practicas;

import util.*;

import java.util.Scanner;

public class Pract4 extends Practica{

    Scanner scaner = new Scanner(System.in);

    public void init() {
        
        int horaIntroducida = -1;

        int clave = -1;
        while(clave == -1){
            Comentario.print(CColor.BLUE,"\n\nIntroduce tus horas trabajadas(max: 2.147.483.647): ");
            horaIntroducida = scaner.nextInt();
            
            
            if(horaIntroducida > 0){
                clave = 1;
            }

            if(clave==-1){
                if(horaIntroducida == 0){
                    Comentario.print(CColor.RED,"\nEl circo no está aquí y tampoco esto no es lugar para payasos;",
                    "En caso contrario, buscate trabajo mano' anda(https://www.infojobs.net/)"
                );
                }else{
                    Comentario.print(CColor.RED,"\nNúmero mal escrito o incorrecto, intentalo otra vez;");
                }
            }
        }

        calculoHora(horaIntroducida);

        Tiempo.pausar();
        
    }
    

    private static void calculoHora(int horas){


        int horasExtra = horas - 40;
        boolean existenHorasExtras = false; if(horasExtra > 0){existenHorasExtras = true;}
        int precioHora = 12;    
        int precioHoraExtra = 16;

        
        Comentario.print(CColor.GREEN,"\n","________________________________________\n");

        Comentario.print(CColor.WHITE, "Horas totales: ",CColor.BLUE,horas,"h.");
        if(existenHorasExtras){
            Comentario.print("\n",CColor.WHITE, "Horas normales: ",CColor.BLUE,40,"h.");
            Comentario.print("\n",CColor.WHITE, "Horas extra: ",CColor.BLUE,horasExtra,"h.");
            Comentario.print(CColor.GREEN,"\n","_________________________\n");
            Comentario.print(CColor.WHITE, "Pago horas normales: ",CColor.BLUE,40*precioHora, "€.");
            Comentario.print("\n",CColor.WHITE, "Pago horas extra: ",CColor.BLUE,horasExtra*precioHoraExtra, "€.");
            Comentario.print(CColor.GREEN,"\n","_________________________\n");
            Comentario.print(CColor.WHITE, "Pago total: ",CColor.BLUE,horasExtra*precioHoraExtra + 40*precioHora , "€.");
        }else{
            Comentario.print("\n",CColor.WHITE, "Horas normales: ",CColor.BLUE,horas,"h.");
            Comentario.print("\n",CColor.WHITE, "Horas extra: ",CColor.BLUE,0,"h.");
            Comentario.print(CColor.GREEN,"\n","_________________________\n");
            Comentario.print(CColor.WHITE, "Pago horas normales: ",CColor.BLUE,horas*precioHora, "€.");
            Comentario.print("\n",CColor.WHITE, "Pago horas extra: ",CColor.BLUE,0, "€.");
            Comentario.print(CColor.GREEN,"\n","_________________________\n");
            Comentario.print(CColor.WHITE, "Pago total: ",CColor.BLUE,horas*precioHora , "€.");
        }

        //no hace falta poner if porque la unica opcion que queda es la de buenas noches. 

        Comentario.print(CColor.GREEN,"\n","________________________________________");
    }

}
