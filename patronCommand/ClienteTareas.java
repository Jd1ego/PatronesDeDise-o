public class ClienteTareas {
    public static void main(String[] args) {
        GestorDeTareas gestorDeTareas = new GestorDeTareas();
        InvocadorTareas invocadorTareas = new InvocadorTareas();

        Tarea tarea = new Tarea("Unsolid");

        Command Crearcommand = new CrearCommand(gestorDeTareas, tarea);
        invocadorTareas.ejecutarCommando(Crearcommand);


        Command Editarcommand = new EditarCommand(gestorDeTareas, tarea, "Patrones de diseño ");
        invocadorTareas.ejecutarCommando(Editarcommand);

        invocadorTareas.deshacerComando();

        Command CompletarCommand = new CompletarCommand(gestorDeTareas, tarea);
        invocadorTareas.ejecutarCommando(CompletarCommand);

        invocadorTareas.deshacerComando();

        Command EliminarCommand = new EliminarCommand(gestorDeTareas, tarea);
        invocadorTareas.ejecutarCommando(EliminarCommand);

            
        };
        









    }


