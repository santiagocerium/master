class primero{
    static private int numero = 33;
    

    public static void main(String[] args) {
        
        interna a;
        a = new interna();

        a.entero = 5;
        a.mostrar();
        int contador = 1;
        System.out.printf("Hola, mundo %d \n", primero.numero);
        primero.numero = contador;
        System.out.printf("Hola, mundo %d \n", primero.numero);

        System.out.printf("Hola, Santi %d \n", a.entero);
        a.mostrar();
    }

}

class interna {
        public int entero = 0;

        public interna (){}

        void mostrar () {
            System.out.printf("ENTERO: %d\n", this.entero*5);
        }
    }
