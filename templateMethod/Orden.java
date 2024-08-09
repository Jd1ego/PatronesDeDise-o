public abstract class Orden {

    public void realizarOrden(){
        tomarOrden();
        verificarDisponibilidad();
        calcularPrecio();
        prepararOrden();
        entregarOrden();

    }

    void tomarOrden(){
        System.out.println("Tomando orden...");
    }

    void verificarDisponibilidad(){
        System.out.println("Revisando disponibilidad...");
    }

    abstract void calcularPrecio();

    abstract void prepararOrden();

    void entregarOrden(){
        System.out.println("Orden entregada!");
    }



}

