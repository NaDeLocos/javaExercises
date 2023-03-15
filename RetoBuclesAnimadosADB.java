class RetoBuclesAnimadosADB{
    public static void main(String[] args) {
        crearOla();
    }

    private static void crearOla(){
        for(int i = 0;i <= 9;i++){
            for(int u = 0;u <= i;u++){
                System.out.print(u);
            }
            System.out.println("");
        }
        for(int i = 9;i >= 0;i--){
            for(int u = 0;u <= i;u++){
                System.out.print(u);
            }
            System.out.println("");
        }
    }
}

