public class ClienteClonacion {
        public static void main(String[] args) {
            Espadachin originalEspadachin = new Espadachin("John", 5, 7,1,"Caballero");
    
            Mago originalMago = new Mago("Luis", 99, 32, 5, "Ancestral");
    
            Mago clonarMago = (Mago) originalMago.copiar();
    
            Espadachin clonarEspadachin = (Espadachin) originalEspadachin.copiar();
    
            clonarEspadachin.setNombre("Juan");
            clonarEspadachin.setExperiencia(60);
            clonarEspadachin.setAspectoVisual("Bandido");
            clonarMago.setNivel(57);
            clonarMago.setAspectoVisual("Viejo");
    
    
    
            System.out.println(originalEspadachin);
            System.out.println(clonarEspadachin);
    
            System.out.println(originalMago);
            System.out.println(clonarMago);
    
    
        }
    }
    