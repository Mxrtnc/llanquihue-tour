package model;

// Clase que representa la ubicación de un tour (composición con Tour)
public class Ubicacion {

    private String region;
    private String comuna;

    public Ubicacion(String region, String comuna) {
        this.region = region;
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "region='" + region + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
