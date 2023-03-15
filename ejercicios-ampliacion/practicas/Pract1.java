package practicas;

import util.*;

import java.util.Scanner;
import java.util.HashMap;

public class Pract1 extends Practica{

    Scanner scaner = new Scanner(System.in);
    HashMap<Integer,String> tabla = new HashMap<>();
    static String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
    String diaIntroducido = "string";

    public void init() {
        tabla.put(1,"descansar!!");
        tabla.put(2, "física");
        tabla.put(3,"física");
        tabla.put(4,"informática");
        tabla.put(5,"inglés");
        
        
        int clave = -1;
        while(clave == -1){
            Comentario.print(CColor.BLUE,"\n\nIntroduce un día de la semana: ");

            diaIntroducido = new String(scaner.nextLine());
           

            clave = comprobarSiEsUnDia(diaIntroducido);

            if(clave == -1){
                Comentario.print(CColor.RED,"\nDía mal escrito o incorrecto, recuerda no agregar puntos o comas,intenta de nuevo:");
            }
        }

        String dia = dias[clave];
        String materia = tabla.get(clave + 1);

        Comentario.print(CColor.GREEN,"\n",
            "________________________________________\n","\n",
            CColor.BLUE,"El ",dia," toca ",materia,".\n",
            CColor.GREEN,"________________________________________\n");


        Tiempo.pausar();
    }

    public static int comprobarSiEsUnDia(String str){
        //return -1 = nill; return 0-4 => dia de la semana en la tabla.
        int n = -1;
        for(String i : dias){
            n++;
            if(str.toLowerCase() .equals (i.toLowerCase())){
                return n;
            }
        }

        return -1;
    }
    
}
