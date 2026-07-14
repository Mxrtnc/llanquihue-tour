package ui;

import javax.swing.JOptionPane;
import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;

public class GestorEntidadesGUI {

    private GestorEntidades gestor;

    public GestorEntidadesGUI(GestorEntidades gestor) {
        this.gestor = gestor;
    }

    public void iniciar() {
        int opcion;

        do {
            String menu = "Llanquihue Tour - Menu\n"
                    + "1. Ingresar Guia Turistico\n"
                    + "2. Ingresar Vehiculo\n"
                    + "3. Mostrar entidades registradas\n"
                    + "4. Salir";

            String respuesta = JOptionPane.showInputDialog(null, menu, "Menu Principal",
                    JOptionPane.QUESTION_MESSAGE);

            if (respuesta == null) {
                break;
            }

            opcion = Integer.parseInt(respuesta.trim());

            switch (opcion) {
                case 1:
                    ingresarGuia();
                    break;
                case 2:
                    ingresarVehiculo();
                    break;
                case 3:
                    mostrarEntidades();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
        } while (opcion != 4);
    }

    private void ingresarGuia() {
        String nombre = JOptionPane.showInputDialog("Nombre del guia:");
        String idioma = JOptionPane.showInputDialog("Idioma que habla:");
        String experienciaTexto = JOptionPane.showInputDialog("Anios de experiencia:");
        int experiencia = Integer.parseInt(experienciaTexto.trim());

        GuiaTuristico guia = new GuiaTuristico(nombre, idioma, experiencia);
        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(null, "Guia registrado:\n" + guia.mostrarResumen());
    }

    private void ingresarVehiculo() {
        String nombre = JOptionPane.showInputDialog("Nombre o modelo del vehiculo:");
        String patente = JOptionPane.showInputDialog("Patente:");
        String capacidadTexto = JOptionPane.showInputDialog("Capacidad de pasajeros:");
        int capacidad = Integer.parseInt(capacidadTexto.trim());

        Vehiculo vehiculo = new Vehiculo(nombre, patente, capacidad);
        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(null, "Vehiculo registrado:\n" + vehiculo.mostrarResumen());
    }

    private void mostrarEntidades() {
        if (gestor.getEntidades().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay entidades registradas aun.");
            return;
        }

        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < gestor.getEntidades().size(); i++) {
            texto.append(gestor.getEntidades().get(i).mostrarResumen()).append("\n");
        }

        JOptionPane.showMessageDialog(null, texto.toString());
    }
}
