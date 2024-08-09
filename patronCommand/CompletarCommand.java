public class CompletarCommand implements Command{


    public GestorDeTareas gestorDeTareas;
    public Tarea tarea;
    private boolean estado;

    public CompletarCommand(GestorDeTareas gestorDeTareas, Tarea tarea) {

        this.gestorDeTareas = gestorDeTareas;
        this.tarea = tarea;

    }

    @Override
    public void ejecutar() {
        estado = tarea.tareaCompletada();
        tarea.setCompletado(true);
        gestorDeTareas.actualizarTarea(tarea);
    }

    @Override
    public void deshacer() {
        tarea.setCompletado(estado);
        gestorDeTareas.actualizarTarea(tarea);
    }

}
