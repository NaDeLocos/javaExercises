import java.util.Scanner;

public class OperacionesCadenasADB {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        String frase = scan.nextLine();
        boolean ejecutando = true;
        while(ejecutando){
            String 
            fraseMayus = frase.toUpperCase();
            System.out.println("MENÚ:\n====================================\n1.- Contar palabras.\n2.- Iniciales.\n3.- Sustituir carácter.\n4.- Al revés.\n0.- Salir.");
            
            int num = -1;
            while(num < 0 || num > 4){
                System.out.println("Elige una opción: ");
                num = scan.nextInt();
            }

            switch(num){
                case 1:
                    int palabras = 1;
                    for(int i = 0;i <frase.length();i++){
                        if(frase.charAt(i) == ' ' || frase.charAt(i) == '\n'){
                            palabras++;
                        }
                    }
                    System.out.println("La frase tiene "+palabras+" palabras.");
                break;
                case 2:
                    String StringConMayus = "";
                    StringConMayus = StringConMayus + fraseMayus.charAt(0);
                    for(int i = 1;i <frase.length();i++){
                        if(fraseMayus.charAt(i) == ' ' || fraseMayus.charAt(i) == '\n'){
                            StringConMayus = StringConMayus + frase.charAt(i);
                            i++;
                            StringConMayus = StringConMayus + fraseMayus.charAt(i);
                        }else{
                            StringConMayus = StringConMayus + frase.charAt(i);
                        }
                    }
                    System.out.println(StringConMayus);
                break;
                case 3:
                    scan.nextLine();
                    System.out.print("Inserta el caracter que se sustituya: ");
                    char caracterSustituido = scan.nextLine().charAt(0);
                    System.out.print("Inserta el caracter que lo sustituye: ");
                    char caracterqueSustituya = scan.nextLine().charAt(0);

                    String nuevoString = "";

                    for(int i = 0;i <frase.length();i++){
                        if(frase.charAt(i) == caracterSustituido){
                            nuevoString = nuevoString + caracterqueSustituya;
                        }else{
                            nuevoString = nuevoString + frase.charAt(i);
                        }
                    }
                    System.out.println(nuevoString);
                break;
                case 4:
                String StringAlReves = "";

                for(int i = frase.length()-1;i >= 0;i--){
                    StringAlReves = StringAlReves + frase.charAt(i);
                }

                System.out.println(StringAlReves);
                break;
                case 0:
                    ejecutando =  false;
                    System.out.println("Saliendo del programa.");
                break;
            }
            if(!(num == 0)){
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }

        
        System.out.println("Salida existosa.");
        
    }
}
