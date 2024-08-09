public class CrearCommand implements  Command{


    public GestorDeTareas gestorDeTareas;
    public Tarea tarea;


    public CrearCommand(GestorDeTareas gestorDeTareas, Tarea tarea){

        this.gestorDeTareas = gestorDeTareas;
        this.tarea = tarea;

    }

    @Override
    public void ejecutar() {
        gestorDeTareas.añadirTarea(tarea);
    }

    @Override
    public void deshacer() {
        gestorDeTareas.EliminarTarea(tarea);
    }

}
