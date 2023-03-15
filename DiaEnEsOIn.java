import java.util.Scanner;

public class DiaEnEsOIn {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("\nDía de la semana: ");
        int num = scan.nextInt();
        if( !(num >= 1 && num <= 7) ){
            System.out.println("Error: "+num +" no es un día de la semana válido, escribe un número entre 1 y 7");
            return;
        }

        System.out.print("Idioma: ");
        String idioma = scan2.nextLine();
        if( !(idioma.equals("es") || idioma.equals("en")) ){
            System.out.println("Error: no puedo traducir al lenguaje “"+idioma+"”. Solo se admite “es” para español y “en” para inglés");
            return;
        }

        System.out.println("\n");
        
        switch(idioma){

            case "es":
                switch(num){
                    case 1:
                    System.out.println("Lunes");return;
                    case 2:
                    System.out.println("Martes");return;
                    case 3:
                    System.out.println("Míercoles");return;
                    case 4:
                    System.out.println("Jueves");return;
                    case 5:
                    System.out.println("Viernes");return;
                    case 6:
                    System.out.println("Sábado");return;
                    case 7:
                    System.out.println("Domingo");return;
                }
            return;



            case "en":
            switch(num){
                case 1:
                System.out.println("Monday");return;
                case 2:
                System.out.println("Tuesday");return;
                case 3:
                System.out.println("Wednesday");return;
                case 4:
                System.out.println("Thursday");return;
                case 5:
                System.out.println("Friday");return;
                case 6:
                System.out.println("Saturday");return;
                case 7:
                System.out.println("Sunday");return;
            }
            return;
        }


        System.out.println("Esto no debería imprimirse.");
    }
    
}
