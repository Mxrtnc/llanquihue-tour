package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona la colección polimórfica de servicios turísticos
public class GestorServicios {

    // Colección polimórfica: referencia tipo superclase, objetos de subclases
    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        this.servicios = new ArrayList<>();
        cargarServicios();
    }

    // Carga al menos cinco objetos combinando distintas subclases
    private void cargarServicios() {
        servicios.add(new RutaGastronomica("Ruta de los Sabores Lacustres", 4, 5));
        servicios.add(new RutaGastronomica("Sabores de Frutillar", 3, 4));
        servicios.add(new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Travesía Isla Huar", 3, "Lancha"));
        servicios.add(new ExcursionCultural("Historia de Puerto Octay", 5, "Museo El Colono"));
        servicios.add(new ExcursionCultural("Patrimonio Alemán de Frutillar", 4, "Teatro del Lago"));
    }

    // Retorna la lista de servicios
    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    // Recorre la colección e invoca mostrarInformacion() polimórficamente
    public void mostrarTodos() {
        System.out.println("=== Servicios turísticos de Llanquihue Tour ===");
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}
