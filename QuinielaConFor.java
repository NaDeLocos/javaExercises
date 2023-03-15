import java.lang.Math;

public class QuinielaConFor{
    public static void main(String[] args){
        System.out.println("----------------------------------------------------------------");
        
        for(int i = 0;i<=15;i++){
            System.out.println("Partido " + i +": \t\t" + resultadoAleatorio());
        }
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