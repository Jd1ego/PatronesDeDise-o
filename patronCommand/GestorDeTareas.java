import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {
    
    private List<Tarea> tareas = new ArrayList<>();

    public void añadirTarea(Tarea Tarea){
        tareas.add(Tarea);
        System.out.println("Tarea añadida "+Tarea.Nombre+" Estado: "+Tarea.completado);
    }
    public void EliminarTarea(Tarea Tarea){
        tareas.remove(Tarea);
        System.out.println("Tarea eliminada "+Tarea.Nombre);
    }
    public void actualizarTarea(Tarea Tarea) {
        int index = tareas.indexOf(Tarea);
        if (index >= 0) {
            tareas.set(index, Tarea);
            System.out.println("Tarea actualizada "+Tarea.Nombre+" Estado: "+Tarea.completado);
        }
    }

}
