public class ClienteHabitacion{
    public static void main(String[] args) {

        Habitacion habitacion = new HabitacionConcreta();

        

        habitacion = new FloresFrescasDecorator(habitacion);

       

        habitacion = new VinoDecorator(habitacion);
        
        
       

        habitacion = new ChocolateGourmetDecorator(habitacion);

        
        System.out.println(habitacion.consultarDecoracion());


    }
}