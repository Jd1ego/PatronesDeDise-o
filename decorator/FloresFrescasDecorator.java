public class FloresFrescasDecorator extends HabitacionDecorator{

    public FloresFrescasDecorator(Habitacion habitacionADecorar) {
        super(habitacionADecorar);
    }

    @Override
    public String consultarDecoracion() {
        return this.habitacionDecorada.consultarDecoracion() + ", con flores frescas";

    }

}
