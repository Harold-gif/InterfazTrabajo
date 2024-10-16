
class Coche extends Vehiculo {
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche.");
    }
}

