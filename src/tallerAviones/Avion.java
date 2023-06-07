package tallerAviones;



public class Avion {
    private String fabricante;
    private String modelo;
    private int anio;
    private int capacidadPasajeros;
    private double velocidadMaxima;

    public Avion(String fabricante, String modelo, int anio, int capacidadPasajeros, double velocidadMaxima) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }


	public void despegar() {
        System.out.println("El avión despegó.");
    }

    public void aterrizar() {
        System.out.println("El avión aterrizó.");
    }

    public String obtenerInformacion() {
        return "Fabricante: " + fabricante + "\n" +
               "Modelo: " + modelo + "\n" +
               "Año: " + anio + "\n" +
               "Capacidad de pasajeros: " + capacidadPasajeros + "\n" +
               "Velocidad máxima: " + velocidadMaxima + " km/h";
    }
}