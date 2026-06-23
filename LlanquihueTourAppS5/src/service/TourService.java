package service;

import model.Tour;

import java.util.ArrayList;

// Clase de servicio que aplica operaciones sobre la colección de tours
public class TourService {

    private ArrayList<Tour> tours;

    public TourService(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    // Muestra todos los tours por consola
    public void mostrarTodos() {
        System.out.println("=== Listado completo de tours ===");
        for (Tour tour : tours) {
            System.out.println(tour.toString());
        }
    }

    // Filtra y muestra los tours por tipo
    public void filtrarPorTipo(String tipo) {
        System.out.println("\n=== Tours filtrados (tipo = " + tipo + ") ===");
        for (Tour tour : tours) {
            if (tour.getTipo().equals(tipo)) {
                System.out.println(tour.toString());
            }
        }
    }

    // Busca un tour por nombre
    public void buscarPorNombre(String nombre) {
        System.out.println("\n=== Búsqueda por nombre: " + nombre + " ===");
        boolean encontrado = false;
        for (Tour tour : tours) {
            if (tour.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(tour.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el tour: " + nombre);
        }
    }
}
