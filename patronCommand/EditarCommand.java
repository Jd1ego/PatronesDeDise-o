public class EditarCommand implements Command{

    public GestorDeTareas gestorDeTareas;
    public Tarea tarea;
    public String nombre;
    public String nombreAnterior;

    public EditarCommand(GestorDeTareas gestorDeTareas, Tarea tarea, String nombre ){

        this.gestorDeTareas = gestorDeTareas;
        this.tarea = tarea;
        this.nombre = nombre;
    }

    @Override
    public void ejecutar() {
        nombreAnterior = tarea.Nombre;
        tarea.Nombre = nombre;
        gestorDeTareas.actualizarTarea(tarea);
    }

    @Override
    public void deshacer() {
        tarea.Nombre = nombreAnterior;
        gestorDeTareas.actualizarTarea(tarea);
    }

}
