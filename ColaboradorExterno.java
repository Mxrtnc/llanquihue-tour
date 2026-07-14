package model;

// Clase base para las nuevas entidades de la agencia (guias, vehiculos, colaboradores)
public abstract class RecursoAgencia implements Registrable {

    protected String nombre;

    public RecursoAgencia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Cada subclase entrega su propio resumen
    public abstract String mostrarResumen();
}
