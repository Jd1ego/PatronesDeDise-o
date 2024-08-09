public class FloresFrescasDecorator extends HabitacionDecorator{

    public FloresFrescasDecorator(Habitacion habitacionADecorar) {
        super(habitacionADecorar);
    }

    @Override
    public String consultarDecoracion() {
        return "habitacion decorada con flores frescas";
        
    }

}
