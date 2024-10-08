import java.util.ArrayList;
import java.util.List;

public class Mago extends ClasePersonaje {
    private static final String CLASE = "Mago";
    private static final List<String> HABILIDADES_PROPIAS;

    static {
        HABILIDADES_PROPIAS = new ArrayList<>();
        HABILIDADES_PROPIAS.add("Piromancia");
        HABILIDADES_PROPIAS.add("BOLA DE FOGO");
    }

    public Mago(String nombre, int experiencia, int puntos_habilidad, int nivel, String aspectoVisual) {
        super(nombre, new ArrayList<>(HABILIDADES_PROPIAS), experiencia, puntos_habilidad, nivel, aspectoVisual);
    }

    @Override
    public String getClase() {
        return CLASE;
    }

    @Override
    public ClasePersonaje copiar() {
        return new Mago(this.nombre, this.experiencia, this.puntos_habilidad, this.nivel, this.aspectoVisual);
    }
}
