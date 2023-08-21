package CaballerosDelZodiaco_4;

public class Caballero {
    private String nombre;
    private int edad;
    private int maldad;
    private Constelacion constelacion;

    public Caballero(String nombre, int edad, int maldad, Constelacion c) {
        this.nombre = nombre;
        this.edad = edad;
        this.maldad = maldad;
        this.constelacion = c;
    }

    public boolean esPrecoz() {
        return edad < 12;
    }

    /*
    Para saber si el caballero es de oro debe estar asociado a una constelacion que este
    en la banda celeste.
    */
    public boolean esDeOro() {
        return constelacion.getBandaCeleste();
    }

    public boolean esPoderoso() {
        return esPrecoz() && esDeOro();
    }

    public int getMaldad() {
        return maldad;
    }

    public Constelacion getConstelacion() {
        return constelacion;
    }
}
