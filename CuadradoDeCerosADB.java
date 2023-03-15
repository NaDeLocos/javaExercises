public class CuadradoDeCerosADB {

    public static void main(String[] args){
        filaDeCeros();
        for(int i = 1; i <= 8;i++){
            saltoDeLinea();
            cero();
            dieciseisEspacios();
            cero();
        }
        saltoDeLinea();
        filaDeCeros();

    }

    private static void filaDeCeros(){
        for(int i = 1; i <= 10; i++){
            cero();
            espacio();
        }
    }

    private static void dieciseisEspacios(){
        for(int i = 1; i <= 17; i++){
            espacio();
        }
    }
    
    private static void cero(){
        System.out.print("0");
    } 

    private static void espacio(){
        System.out.print(" ");
    } 

    private static void saltoDeLinea(){
        System.out.print("\n");
    } 
}
