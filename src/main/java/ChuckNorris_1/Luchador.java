package ChuckNorris_1;

public class Luchador {
    private String nombre;
    private int fuerza;
    private boolean sabeJJ;

    // constructor
    public Luchador(String nombre, int fuerza, boolean sabeJJ) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.sabeJJ = sabeJJ;
    }

    public boolean esInsecto() {
        return fuerza < 50;
    }

    public boolean esChuckNorris() {
        return true;
    }

    public boolean sabeJJ() {
        return sabeJJ;
    }
}
