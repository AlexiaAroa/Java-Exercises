package CaballerosDelZodiaco_4;

public class Constelacion {
    private int distanciaAlSol;
    private boolean bandaCeleste;

    public Constelacion(int distanciaAlSol, boolean bandaCeleste) {
        this.distanciaAlSol = distanciaAlSol;
        this.bandaCeleste = bandaCeleste;
    }

    /*
    Las constelaciones mas cercanas al sol: son aquellas que estan a menos de 1 mil
    millones de años luz del sol.
    */
    public boolean estaCercaAlSol() {
        return distanciaAlSol < 1000000000;
    }

    public boolean getBandaCeleste() {
        return bandaCeleste;
    }
}
