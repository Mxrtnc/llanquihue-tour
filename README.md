package ui;

import data.GestorServicios;
import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Crear el gestor y mostrar todos los servicios polimórficamente
        GestorServicios gestor = new GestorServicios();
        gestor.mostrarTodos();

        // Semana 8: nuevas entidades gestionadas mediante la interfaz Registrable
        GestorEntidades gestorEntidades = new GestorEntidades();
        gestorEntidades.agregarEntidad(new GuiaTuristico("Pedro Soto", "Espanol", 5));
        gestorEntidades.agregarEntidad(new Vehiculo("Minibus Mercedes", "AB-CD-12", 20));
        gestorEntidades.agregarEntidad(new ColaboradorExterno("Restaurante El Fogon", "Alimentacion"));

        System.out.println("\n=== Entidades registradas (Semana 8) ===");
        gestorEntidades.mostrarTodas();

        // Se abre la interfaz grafica para ingresar y visualizar nuevas entidades
        GestorEntidadesGUI gui = new GestorEntidadesGUI(gestorEntidades);
        gui.iniciar();
    }
}
