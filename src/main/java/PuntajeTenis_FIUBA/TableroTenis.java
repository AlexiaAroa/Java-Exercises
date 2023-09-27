package PuntajeTenis_FIUBA;

public class TableroTenis implements PuntajeTenis{

    private Puntos[] puntajeGame;

    public TableroTenis() {
        // El primero indica los puntos del jugador local, el segundo, del visitante.
        this.puntajeGame = new Puntos[]{Puntos.CERO, Puntos.CERO};
    }
    @Override
    public void punto(Jugador j) {

        // j.ordinal() -> obtengo la posición de puntajeGame, si es local o visitante
        // entonces, el puntaje actual, está en esa posición.
        Puntos puntajeActual = puntajeGame[j.ordinal()]; // me retorna CERO. El nombre.
        // incremento el puntaje en el ordinal.


        System.out.println(puntajeActual);

    }

    @Override
    public Jugador servicio() {
        return null;
    }

    @Override
    public int[][] puntajeSets() {
        return new int[0][];
    }

    @Override
    public Puntos[] puntajeGame() {
        return puntajeGame;
    }
}
