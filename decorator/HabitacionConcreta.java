public class HabitacionConcreta implements Habitacion {

    public int numeroHabitacion;
    public boolean disponible;

    @Override
    public String  consultarDecoracion() {
    
        return "Decoracion Estandar";
    }
    
}
