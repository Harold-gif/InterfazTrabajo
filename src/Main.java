


public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new Coche("Toyota", "Corolla");
        Vehiculo moto = new Moto("Yamaha", "MT-07");



        coche.mostrarDetalles();
        coche.conducir();

        moto.mostrarDetalles();
        moto.conducir();




    }
}
