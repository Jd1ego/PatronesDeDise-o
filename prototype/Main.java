public class Main {
    public static void main(String[] args) {
        Espadachin originalEspadachin = new Espadachin("John", 5, 7,1,"Caballero");

        Mago originalMago = new Mago("Luis", 99, 32, 5, "Ancestral");

        Mago clonarMago = (Mago) originalMago.copiar();

        Espadachin clonarEspadachin = (Espadachin) originalEspadachin.copiar();

        clonarEspadachin.setnombre("Juan");
        clonarEspadachin.setExperiencia(60);
        clonarEspadachin.setAspectoVisual("Bandido");
        clonarMago.setNivel(57);
        clonarMago.setAspectoVisual("Viejo");



        System.out.println("Clase :"+ Espadachin.getClase() + " ,de nombre: " + originalEspadachin.getnombre() + ", Habilidades ùnicas: " +
                originalEspadachin.gethabilidades()+ " Experiencia " + originalEspadachin.getExperiencia() + " ,Puntos de habilidad: " + originalEspadachin.getPuntos_habilidad()
                + " Nivel: " + originalEspadachin.getNivel() + " Aspecto: " + originalEspadachin.getAspectoVisual());

        System.out.println("Personaje clonado= "+" Clase :"+ Espadachin.getClase()+" de nombre: " + clonarEspadachin.getnombre() + ", Habilidades ùnicas: " +
                clonarEspadachin.gethabilidades()+ " Experiencia " + clonarEspadachin.getExperiencia() + " ,Puntos de habilidad: " + clonarEspadachin.getPuntos_habilidad()
                + " Nivel: " + clonarEspadachin.getNivel() + " Aspecto: " + clonarEspadachin.getAspectoVisual());

        System.out.println("Clase :"+ Mago.getClase() + " ,de nombre: " + originalMago.getnombre() + ", Habilidades ùnicas: " +
                originalMago.gethabilidades()+ " Experiencia " + originalMago.getExperiencia() + " ,Puntos de habilidad: " + originalMago.getPuntos_habilidad()
                + " Nivel: " + originalMago.getNivel() + " Aspecto: " + originalMago.getAspectoVisual());

        System.out.println("Personaje clonado= "+" Clase :"+ Mago.getClase()+" de nombre: " + clonarMago.getnombre() + ", Habilidades ùnicas: " +
                clonarMago.gethabilidades()+ " Experiencia " + clonarMago.getExperiencia() + " ,Puntos de habilidad: " + clonarMago.getPuntos_habilidad()
                + " Nivel: " + clonarMago.getNivel() + " Aspecto: " + clonarMago.getAspectoVisual());
    }
}
