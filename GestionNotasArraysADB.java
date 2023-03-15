import java.util.Scanner;


class GestionNotasArraysADB{
    
    public static void main(String[] args){

        int[] notas = new int[5];
        Scanner scanner = new Scanner(System.in);
        boolean 
        cerrar = false,
        hayNotas = false;
        int eleccion = 0;

        while(!cerrar){
            //System.out.println("Presiona 1 y enter para contunuar.");
            //while(scanner.nextInt() != 1){
            //    System.out.println("Presiona 1 y enter para contunuar.");
            //}
            System.out.println("MÉNU DE OPCIONES:");
            System.out.println("==========================");
            System.out.println("1.- (Re)Cargar.");
            System.out.println("2.- Mostrar.");
            System.out.println("3.- Sumar.");
            System.out.println("4.- Promedio.");
            System.out.println("5.- Máximo y mínimo.");
            System.out.println("0.- Salir.");
            System.out.print("Elige una opción: ");

            eleccion = scanner.nextInt();
            if(eleccion >= 0 && eleccion <= 5){
                if(!hayNotas){
                    if (eleccion == 0 || eleccion == 1){
                        if (eleccion == 0){
                            cerrar = true;System.out.println("Cerrando el programa.");
                        }else{
                            for(int i = 0; i < 5; i++){
                                System.out.print("Introduce la nota " + (i + 1)+": ");
                                notas[i] = scanner.nextInt();
                            }
                            System.out.println("Notas agregadas correctamente.");
                            hayNotas = true;
                        }
                    }else{
                        System.out.println("Registra las notas primero, no podemos operar sin notas.");
                    }
                }else{
                    switch(eleccion){
                        case 0:
                        cerrar = true;System.out.println("Cerrando el programa.");
                        break;case 1:
                            for(int i = 0; i < 5; i++){
                                System.out.print("Introduce la nota " + (i + 1)+": ");
                                notas[i] = scanner.nextInt();
                                System.out.println("Notas agregadas correctamente.");
                            }
                        break;case 2:
                            for(int i = 0; i < 5; i++){
                                System.out.println("Nota " + (i + 1)+": " + notas[i]);
                            }
                        break;case 3:
                            double suma = 0;
                            for(int i = 0; i < 5; i++){
                                suma += notas[i];
                            }
                            System.out.println("La suma de las notas equivale a :" + suma);
                        break;case 4:
                            double promedio = 0;
                            for(int i = 0; i < 5; i++){
                                promedio += notas[i];
                            }
                            promedio = promedio/5;
                            System.out.println("El promedio de las notas equivale a :" + promedio);
                        break;case 5:
                            int 
                            notaMayor = notas[0],
                            notaMenor = notas[0];
                            for(int i = 0; i < 5; i++){
                                if(notaMayor < notas[i]){
                                    notaMayor = notas[i];
                                }
                                if(not0aMenor > notas[i]){
                                    notaMenor = notas[i];
                                }
                            }
                            System.out.println("La nota menor equivale a " + notaMenor + " y la nota mayor equivale a " + notaMayor + ".");
                        break;
                    }
                }
            }else{
                System.out.println("Número elegido no válido. Intentelo de nuevo.");
            }
        }


        scanner.close();
    }
}
