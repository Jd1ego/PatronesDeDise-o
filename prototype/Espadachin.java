import java.util.ArrayList;
import java.util.List;


public class Espadachin extends ClasePersonaje {
    private static List<String> Habilidades_propias = new ArrayList();
    private static final String clase = "Espadachin";

    public Espadachin(String nombre, int experiencia, int puntos_habilidad, int nivel, String aspectoVisual) {
        super(nombre, new ArrayList(Habilidades_propias), experiencia, puntos_habilidad, nivel, aspectoVisual);
    }

    public ClasePersonaje copiar() {
        return new Espadachin(this.nombre, this.experiencia, this.puntos_habilidad, this.nivel, this.aspectoVisual);
    }

    public static String getClase() {
        return "Espadachin";
    }

    static {
        Habilidades_propias.add("Ataque de espada");
        Habilidades_propias.add("Estocada");
    }
}
