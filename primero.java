class primero{
    static private int numero = 33;
    public static void main(String[] args) {
        
        int contador = 1;
        System.out.printf("Hola, mundo %d \n", primero.numero);
        primero.numero = 44;
        System.out.printf("Hola, mundo %d \n", primero.numero);
    }

}
