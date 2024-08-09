public class ClienteOrden {
    public static void main(String[] args) {

        Orden comida = new OrdenarComida();
        Orden bebida = new OrdenarBebida();
        Orden postre = new OrdenarPostre();

        comida.realizarOrden();
        System.out.println();
        bebida.realizarOrden();
        System.out.println();
        postre.realizarOrden();


    }
}