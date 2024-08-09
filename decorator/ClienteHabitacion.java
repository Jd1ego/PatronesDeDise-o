public class ClienteHabitacion{
    public static void main(String[] args) {

        Habitacion habitacion = new HabitacionConcreta();

        //System.out.println(habitacion.consultarDecoracion());

        habitacion = new FloresFrescasDecorator(habitacion);

       // System.out.println(habitacion.consultarDecoracion());

        habitacion = new VinoDecorator(habitacion);
        
        
       // System.out.println(habitacion.consultarDecoracion());

        //habitacion = new ChocolateGourmetDecorator(habitacion);

        
        System.out.println(habitacion.consultarDecoracion());


    }
}