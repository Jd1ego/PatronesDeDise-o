public class VinoDecorator extends  HabitacionDecorator{
    
    public VinoDecorator(Habitacion habitacionADecorar) {
        super(habitacionADecorar);
    }
    @Override
    public String consultarDecoracion() {
        return "habitacion con servicio de vino";
        
    }
    
}