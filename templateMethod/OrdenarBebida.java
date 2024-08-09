public class OrdenarBebida extends Orden{

    private int precio = 8000;

    @Override
    void prepararOrden() {
        System.out.println("Preparando bebida");
    }


    @Override
    void calcularPrecio(){

        System.out.println("El precio es: " + precio);

    }




}