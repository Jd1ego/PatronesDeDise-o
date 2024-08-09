import java.util.List;

public abstract class ClasePersonaje implements Prototipo {
    String nombre;
    List<String> habilidades;
    int experiencia;
    int puntos_habilidad;
    int nivel;
    String aspectoVisual;

    public ClasePersonaje(String nombre, List<String> habilidades, int experiencia, int puntosHabilidad, int nivel, String aspectoVisual) {
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.puntos_habilidad = puntosHabilidad;
        this.nivel = nivel;
        this.aspectoVisual = aspectoVisual;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> gethabilidades() {
        return this.habilidades;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPuntos_habilidad() {
        return this.puntos_habilidad;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAspectoVisual(String aspectoVisual) {
        this.aspectoVisual = aspectoVisual;
    }

    public String getAspectoVisual() {
        return this.aspectoVisual;
    }
}


