public class Celular implements Notificar_dispositivos {
    String nombre;

    public void notificar(String notificacion) {
        System.out.println(this.nombre + " tiene una notificacion: " + notificacion);
    }

    public Celular(String nombre) {
        this.nombre = nombre;
    }
}
