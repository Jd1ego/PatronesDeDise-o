import java.util.Stack;

public class InvocadorTareas {
    private Stack<Command> historial = new Stack<>();

    public void ejecutarCommando(Command command) {
        command.ejecutar();
        historial.push(command);
    }

    public void deshacerComando() {
        if (!historial.isEmpty()) {
            Command command = historial.pop();
            command.deshacer();
        }
    }

}
