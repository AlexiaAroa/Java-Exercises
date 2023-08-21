package BatmansDelMercosur_2;

public class Batman {
    private String nombre;
    private int cantFacturasEnSangre = 0;
    private boolean soloHablaIngles;
    private boolean esDeKripton;

    public void irALaPanaderia() {
        cantFacturasEnSangre += 6;
    }

    public boolean esKryngo() {
        return soloHablaIngles && esDeKripton;
    }

    public boolean necesitaTraductor() {
        return soloHablaIngles;
    }

    public boolean tieneAltoNivelFactEnSangre() {
        return cantFacturasEnSangre > 1500;
    }

    // SET Y GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantFacturasEnSangre(int cantFacturasEnSangre) {
        this.cantFacturasEnSangre = cantFacturasEnSangre;
    }

    public int getCantFacturasEnSangre() {
        return cantFacturasEnSangre;
    }

    public void setSoloHablaIngles(boolean soloHablaIngles) {
        this.soloHablaIngles = soloHablaIngles;
    }

    public boolean getSoloHablaIngles() {
        return soloHablaIngles;
    }

    public void setEsDeKripton(boolean esDeKripton) {
        this.esDeKripton = esDeKripton;
    }

    public boolean getEsDeKripton() {
        return esDeKripton;
    }
}
