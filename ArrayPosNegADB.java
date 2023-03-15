import java.util.Scanner;


class ArrayPosNegADB{
    
    public static void main(String[] args){

        int[] lista1 = new int[5],lista2 = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame cinco números para crear un array con ellos...");
        for(int i = 0; i < 5;i++){
            System.out.print("Número "+(i + 1)+":");
            lista1[i] = scanner.nextInt();
            lista2[i] = -lista1[i];
        }

        System.out.println("Array 1:");
        for(int i = 0; i < 5;i++){
            System.out.print(lista1[i] + " ");
        }

        System.out.println("\nArray 2:");
        for(int i = 0; i < 5;i++){
            System.out.print(lista2[i] + " ");
        }


        scanner.close();
    }
}