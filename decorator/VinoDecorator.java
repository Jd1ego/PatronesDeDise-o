public class VinoDecorator extends  HabitacionDecorator{
    
    public VinoDecorator(Habitacion habitacionADecorar) {
        super(habitacionADecorar);
    }
    @Override
    public String consultarDecoracion() {
        return this.habitacionDecorada.consultarDecoracion() + ", con vino";
        
    }
    
}