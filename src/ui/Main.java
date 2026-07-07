package ui;

import data.GestorServicios;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Crear el gestor y mostrar todos los servicios polimórficamente
        GestorServicios gestor = new GestorServicios();
        gestor.mostrarTodos();
    }
}
