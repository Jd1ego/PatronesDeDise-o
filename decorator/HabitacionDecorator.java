public abstract class HabitacionDecorator implements Habitacion{

    private Habitacion habitacionDecorada;

    
    public HabitacionDecorator(Habitacion habitacionADecorar) {
        this.habitacionDecorada = habitacionADecorar;

    }


    @Override
    public String consultarDecoracion() {
        return habitacionDecorada.consultarDecoracion();
        
    }
    
}
