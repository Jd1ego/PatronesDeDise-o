import java.util.List;

public abstract class ClasePersonaje implements Prototipo {
    protected String nombre;
    protected List<String> habilidades;
    protected int experiencia;
    protected int puntos_habilidad;
    protected int nivel;
    protected String aspectoVisual;
    protected String clase;

    public ClasePersonaje(String nombre, List<String> habilidades, int experiencia, int puntos_habilidad, int nivel, String aspectoVisual) {
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.puntos_habilidad = puntos_habilidad;
        this.nivel = nivel;
        this.aspectoVisual = aspectoVisual;
        this.clase = getClase();  // Inicializar el atributo clase con el valor correspondiente
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getHabilidades() {
        return this.habilidades;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPuntosHabilidad() {
        return this.puntos_habilidad;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getAspectoVisual() {
        return this.aspectoVisual;
    }

    public void setAspectoVisual(String aspectoVisual) {
        this.aspectoVisual = aspectoVisual;
    }

    public abstract String getClase();  // Método abstracto para obtener el nombre de la clase

    @Override
    public String toString() {
        return nombre + " (Clase: " + clase + ", Nivel: " + nivel + ", XP: " + experiencia + ", Habilidades: " + habilidades + ", Aspecto Visual: " + aspectoVisual + ")";
    }
}
