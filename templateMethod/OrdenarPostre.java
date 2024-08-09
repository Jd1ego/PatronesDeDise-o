public class OrdenarPostre extends Orden{

    private int precio = 12000;

    @Override
    void prepararOrden() {
        System.out.println("Preparando postre...");
    }


    @Override
    void calcularPrecio(){

        System.out.println("El precio es: " + precio);
    }




}
