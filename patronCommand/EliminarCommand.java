public class EliminarCommand implements Command{


    public GestorDeTareas gestorDeTareas;
    public Tarea tarea;


    public EliminarCommand(GestorDeTareas gestorDeTareas, Tarea tarea){

        this.gestorDeTareas = gestorDeTareas;
        this.tarea = tarea;

    }

    @Override
    public void ejecutar() {
        gestorDeTareas.EliminarTarea(tarea);
    }

    @Override
    public void deshacer() {
        gestorDeTareas.añadirTarea(tarea);
    }

}
