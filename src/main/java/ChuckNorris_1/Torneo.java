package ChuckNorris_1;

import java.util.ArrayList;

public class Torneo {
    public ArrayList<Luchador> luchadores = new ArrayList<Luchador>();

    public ArrayList<Luchador> losChuckNorris() {
        ArrayList<Luchador> resultado = new ArrayList<Luchador>();
        for (Luchador luchador: luchadores) {
            if (luchador.esChuckNorris()) {
                resultado.add(luchador);
            }
        }

        return resultado;
    }
}
