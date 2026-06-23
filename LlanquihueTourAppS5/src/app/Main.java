package app;

import model.Tour;
import service.TourService;
import util.LectorArchivo;

import java.util.ArrayList;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Cargar datos desde archivo usando la clase utilitaria
        LectorArchivo lector = new LectorArchivo();
        ArrayList<Tour> tours = lector.leerTours("resources/tours.txt");

        // Usar el servicio para operar sobre la colección
        TourService servicio = new TourService(tours);

        // Mostrar todos los tours
        servicio.mostrarTodos();

        // Filtrar por tipo "aventura"
        servicio.filtrarPorTipo("aventura");

        // Buscar por nombre
        servicio.buscarPorNombre("Isla Huar");
    }
}
