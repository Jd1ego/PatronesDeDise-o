public class OrdenarComida extends Orden{

    private int precio = 14000;

    @Override
    void prepararOrden() {
        System.out.println("Preparando comida");
    }

    @Override
    void calcularPrecio(){
        System.out.println("El precio es: " + precio);
    }


}
