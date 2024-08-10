import java.util.ArrayList;
import java.util.List;

public class Espadachin extends ClasePersonaje {
    private static final String CLASE = "Espadachin";
    private static final List<String> HABILIDADES_PROPIAS;

    static {
        HABILIDADES_PROPIAS = new ArrayList<>();
        HABILIDADES_PROPIAS.add("Ataque de espada");
        HABILIDADES_PROPIAS.add("Estocada");
    }

    public Espadachin(String nombre, int experiencia, int puntos_habilidad, int nivel, String aspectoVisual) {
        super(nombre, new ArrayList<>(HABILIDADES_PROPIAS), experiencia, puntos_habilidad, nivel, aspectoVisual);
    }

    @Override
    public String getClase() {
        return CLASE;
    }

    @Override
    public ClasePersonaje copiar() {
        return new Espadachin(this.nombre, this.experiencia, this.puntos_habilidad, this.nivel, this.aspectoVisual);
    }
}
