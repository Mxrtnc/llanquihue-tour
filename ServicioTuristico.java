package model;

public class ColaboradorExterno extends RecursoAgencia {

    private String servicioQueOfrece;

    public ColaboradorExterno(String nombre, String servicioQueOfrece) {
        super(nombre);
        this.servicioQueOfrece = servicioQueOfrece;
    }

    public String getServicioQueOfrece() {
        return servicioQueOfrece;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador Externo: " + nombre + " | Servicio: " + servicioQueOfrece;
    }
}
