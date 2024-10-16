
abstract class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void conducir(); // Método abstracto

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

