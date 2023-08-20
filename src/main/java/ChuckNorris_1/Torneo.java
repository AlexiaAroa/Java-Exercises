package ChuckNorris_1;

import java.util.ArrayList;

public class Torneo {
    private ArrayList<Luchador> luchadores = new ArrayList<Luchador>();

    public ArrayList<Luchador> losChuckNorris(int valorDado) {
        ArrayList<Luchador> resultado = new ArrayList<Luchador>();
        for (Luchador luchador: luchadores) {
            if (luchador.esChuckNorris(valorDado)) {
                resultado.add(luchador);
            }
        }

        return resultado;
    }

    public ArrayList<Luchador> losInsectos() {
        ArrayList<Luchador> resultado = new ArrayList<Luchador>();

        for (Luchador luchador: luchadores) {
            if (luchador.esInsecto()) {
                resultado.add(luchador);
            }
        }

        return resultado;
    }

   public boolean hayUnJJ() {
        for (Luchador luchador: luchadores) {
            if (luchador.sabeJJ()) {
                return true;
            }
        }

        return false;
   }

   public int cantidadDeJJ() {
        int cont = 0;

        for (Luchador luchador: luchadores) {
            if (luchador.sabeJJ()) {
                cont++;
            }
        }

        return cont;
   }

   public void inscribir(Luchador luchador) {
        luchadores.add(luchador);
   }
}
