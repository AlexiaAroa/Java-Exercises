package BatmansDelMercosur_2;

import java.util.ArrayList;

public class Convencion {
    private ArrayList<Batman> batmans = new ArrayList<>();

    public ArrayList<Batman> losQueNecesitanTraductor() {
        ArrayList<Batman> res = new ArrayList<>();

        for (Batman b: batmans) {
            if (b.necesitaTraductor()) {
                res.add(b);
            }
        }

        return res;
    }

    public boolean hayBatmanConAltoNivelFenS() {
        for (Batman b: batmans) {
            if (b.tieneAltoNivelFactEnSangre()) {
                return true;
            }
        }

        return false;
    }

    // PRE: El array de batmans no está vacío.
    public Batman elQueComioMasFacturas() {
        Batman res = batmans.get(0);

        for (Batman b: batmans) {
            if (b.getCantFacturasEnSangre() > res.getCantFacturasEnSangre()) {
                res = b;
            }
        }

        return res;
    }

    public void inscribir(Batman batman) {
        batmans.add(batman);
    }
}
