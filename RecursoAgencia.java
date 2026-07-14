package model;

public class Vehiculo extends RecursoAgencia {

    private String patente;
    private int capacidadPasajeros;

    public Vehiculo(String nombre, String patente, int capacidadPasajeros) {
        super(nombre);
        this.patente = patente;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public String mostrarResumen() {
        return "Vehiculo: " + nombre + " | Patente: " + patente
                + " | Capacidad: " + capacidadPasajeros + " pasajeros";
    }
}
