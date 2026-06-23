package model;

// Clase que representa un Tour de Llanquihue Tour
// Usa composición con Ubicacion
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;
    private Ubicacion ubicacion;

    public Tour(String nombre, String tipo, int precio, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", ubicacion=" + ubicacion.toString() +
                '}';
    }
}
