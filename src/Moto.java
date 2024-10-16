
class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo una moto.");
    }
}

