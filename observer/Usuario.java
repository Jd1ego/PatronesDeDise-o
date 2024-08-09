public class Usuario {
    public static void main(String[] args) {

        Dispositivo dispositivo = new Dispositivo();

        Celular cel1 = new Celular("Iphone");
        Celular cel2 = new Celular("Samsung");
        Laptop laptop1 = new Laptop("HP");
        Laptop laptop2 = new Laptop("Asus");

        dispositivo.añadirDispositivo(laptop1);
        dispositivo.añadirDispositivo(laptop2);
        dispositivo.añadirDispositivo(cel1);
        dispositivo.añadirDispositivo(cel2);

        dispositivo.eliminarDispositivo(laptop2);

        dispositivo.notificar("Nuevo mensaje!");

    }
}