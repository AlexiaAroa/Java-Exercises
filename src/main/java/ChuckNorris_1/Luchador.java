package ChuckNorris_1;

public class Luchador {
    private String nombre;
    private int fuerza;
    private boolean sabeJJ;
    private int cv = 3;

    // constructor
    public Luchador(String nombre, int fuerza, boolean sabeJJ) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.sabeJJ = sabeJJ;
    }

    public boolean esChuckNorris(int valorDado) {
        return fuerza * cv > valorDado;
    }

    public boolean esInsecto() {
        return fuerza < 500;
    }

    public boolean sabeJJ() {
        return sabeJJ;
    }
}
