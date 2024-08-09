public class ChocolateGourmetDecorator extends HabitacionDecorator{
    
    public ChocolateGourmetDecorator(Habitacion habitacionADecorar) {
        super(habitacionADecorar);
    }
    @Override
    public String consultarDecoracion() {
        return this.habitacionDecorada.consultarDecoracion() + ", con chocolate gourmet";
        
    }
    
}
