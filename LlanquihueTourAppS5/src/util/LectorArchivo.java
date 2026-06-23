package util;

import model.Tour;
import model.Ubicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase utilitaria encargada de leer el archivo tours.txt
public class LectorArchivo {

    // Lee el archivo y retorna una lista de objetos Tour
    public ArrayList<Tour> leerTours(String rutaArchivo) {
        ArrayList<Tour> lista = new ArrayList<>();
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);
                Ubicacion ubicacion = new Ubicacion(datos[3], datos[4]);
                Tour tour = new Tour(nombre, tipo, precio, ubicacion);
                lista.add(tour);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del precio: " + e.getMessage());
        }

        return lista;
    }
}
