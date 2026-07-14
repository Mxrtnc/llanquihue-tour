package model;

public class GuiaTuristico extends RecursoAgencia {

    private String idioma;
    private int anosExperiencia;

    public GuiaTuristico(String nombre, String idioma, int anosExperiencia) {
        super(nombre);
        this.idioma = idioma;
        this.anosExperiencia = anosExperiencia;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    @Override
    public String mostrarResumen() {
        return "Guia Turistico: " + nombre + " | Idioma: " + idioma
                + " | Experiencia: " + anosExperiencia + " anios";
    }
}
