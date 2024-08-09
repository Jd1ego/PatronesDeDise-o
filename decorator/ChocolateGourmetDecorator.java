public class ChocolateGourmetDecorator extends HabitacionDecorator{
    
    public ChocolateGourmetDecorator(Habitacion habitacionADecorar) {
        super(habitacionADecorar);
    }
    @Override
    public String consultarDecoracion() {
        return "habitacion con servicio de chocolate gourmet";
        
    }
    
}
