import java.util.ArrayList;
import java.util.List;


public class Mago extends ClasePersonaje {
    private static final String clase = "Mago";
    private static List<String> Habilidades_propias = new ArrayList();

    public Mago(String nombre, int experiencia, int puntos_habilidad, int nivel, String aspectoVisual) {
        super(nombre, new ArrayList(Habilidades_propias), experiencia, puntos_habilidad, nivel, aspectoVisual);
    }

    public ClasePersonaje copiar() {
        return new Mago(this.nombre, this.experiencia, this.puntos_habilidad, this.nivel, this.aspectoVisual);
    }

    public static String getClase() {
        return "Mago";
    }

    static {
        Habilidades_propias.add("Piromancia");
        Habilidades_propias.add("BOLA DE FOGO");
    }
}
