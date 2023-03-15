import util.*;

import java.util.HashMap;

import practicas.*;

public class Main{

    static private boolean ejecutandoPrograma = false;
    static HashMap<Integer,Practica> practicas = new HashMap<>();

    //El Scanner es nefasto
    public static void main(String[] args){
        
        ejecutandoPrograma = true;
        Comentario.print(CColor.BLUE, "Programa iniciado.");

        ejecutando();

        Comentario.print(CColor.RED,"\nPrograma cerrado.\n");
    }

    private static void init(){
        practicas.put(1,new Pract1());
    }

    private static void ejecutando(){

        init();

        while(ejecutandoPrograma){
            mostrarMenu();
            int elegido = ElegirNumero.insertarNumero(
                "Escribe el número del ejercicio correspondiente al que quieras acceder: ", 
                5
            );
            
            if(elegido == 5){
                Comentario.print(CColor.RED,"\nCerrando el programa.\n");
                close();
            }else{
                practicas.get(elegido).init();
            }
        }
    }

    public static void close(){
        ejecutandoPrograma = false;
    }

    private static void mostrarMenu(){

        /*formato original
        Comentario.print(
            "\n",
            "________________________________________\n",
            "|                                      |\n",
            "|     Ejercicios de ampliación 1       |\n",
            "|______________________________________|\n",
            "|                                      |\n",
            "| 1| dia de la semana y la asignatura  |\n",
            "| 2| hora, buenas noches, tardes, dias |\n",
            "| 3| del 1 al 7 dia de la semana       |\n",
            "| 4| salario en relación a horas extra |\n",
            "| 5| salir del programa                |\n",
            "|______________________________________|\n"
        );
         */
        String B = CColor.BLUE;
        String R = CColor.RED;
        String G = CColor.GREEN;
        Comentario.print(
            "\n",G,
            "________________________________________\n",
            "|                                      |\n",
            "|     ",B,"Ejercicios de ampliación 1",G,"       |\n",
            "|______________________________________|\n",
            "|                                      |\n",
            "| ",R,"1| ",B,"dia de la semana y la asignatura",G,"  |\n",
            "| ",R,"2| ",B,"hora, buenas noches, tardes, dias",G," |\n",
            "| ",R,"3| ",B,"del 1 al 7 dia de la semana",G,"       |\n",
            "| ",R,"4| ",B,"salario en relación a horas extra",G," |\n",
            "| ",R,"5| ",B,"salir del programa",G,"                |\n",
            "|______________________________________|\n"
        );
    }


}