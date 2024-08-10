import java.util.ArrayList;
import java.util.List;

public class Arquero extends ClasePersonaje {
    private static final String CLASE = "Arquer";
    private static final List<String> HABILIDADES_PROPIAS;

    static {
        HABILIDADES_PROPIAS = new ArrayList<>();
        HABILIDADES_PROPIAS.add("Flecha encantada");
        HABILIDADES_PROPIAS.add("Flecha multiple");
    }

    public Arquero(String nombre, int experiencia, int puntos_habilidad, int nivel, String aspectoVisual) {
        super(nombre, new ArrayList<>(HABILIDADES_PROPIAS), experiencia, puntos_habilidad, nivel, aspectoVisual);
    }

    @Override
    public String getClase() {
        return CLASE;
    }

    @Override
    public ClasePersonaje copiar() {
        return new Arquero(this.nombre, this.experiencia, this.puntos_habilidad, this.nivel, this.aspectoVisual);
    }
}
