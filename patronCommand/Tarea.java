public class Tarea {
    String Nombre = "";
    boolean completado;


    public Tarea(String nombre){
        this.completado=false;
        this.Nombre=nombre;

    }

    public boolean tareaCompletada() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

}
