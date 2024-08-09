import java.util.ArrayList;

import java.util.List;

public class Dispositivo {
    List<Notificar_dispositivos> aparatos = new ArrayList();

    public void añadirDispositivo(Notificar_dispositivos d) {
        this.aparatos.add(d);
    }

    public void eliminarDispositivo(Notificar_dispositivos d) {
        this.aparatos.remove(d);
    }

    public void notificar(String notificacion) {

            for (Notificar_dispositivos d : aparatos) {
                d.notificar(notificacion);
            }

    }
}