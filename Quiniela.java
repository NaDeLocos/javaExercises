import java.lang.Math;

public class Quiniela{
    public static void main(String[] args){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Atlético - Barcelona: \t\t" + resultadoAleatorio());
        System.out.println("Madrid - Rayo Vallecano: \t" + resultadoAleatorio());
        System.out.println("Osasuna - Celta de Vigo: \t" + resultadoAleatorio());
        System.out.println("----------------------------------------------------------------");
    }


    private static String resultadoAleatorio(){
        String resultado = "n/a";

        int numAleatorio = (int)(Math.random() * 3 + 1);//aleatorio entre el 1 y 3

        switch(numAleatorio){
            case 1:
                resultado = "gana el primer equipo(1)";
                break;
            case 2:
                resultado = "empate(x)";
                break;
            case 3:
                resultado = "gana el segundo equipo(2)";
                break;
        }

        return resultado;
    }
}