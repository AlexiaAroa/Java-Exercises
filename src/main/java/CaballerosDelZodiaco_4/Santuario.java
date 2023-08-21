package CaballerosDelZodiaco_4;

import java.util.ArrayList;

public class Santuario {
    private ArrayList<Caballero> losCaballeros = new ArrayList<>();

    // PRE: El array de losCaballeros no está vacío.
    public Caballero encontrarAlPosibleHaces() {
        Caballero res = losCaballeros.get(0);

        for (Caballero c: losCaballeros) {
            if (c.getMaldad() < res.getMaldad()) {
                res = c;
            }
        }

        return res;
    }

    public ArrayList<Constelacion> constelacionesMasCercanasAlSol() {
        ArrayList<Constelacion> res = new ArrayList<>();

        for (Caballero c: losCaballeros) {
            if (c.getConstelacion().estaCercaAlSol()) {
                res.add(c.getConstelacion());
            }
        }

        return res;
    }

    // PRE: El array de losCaballeros no está vacío.
    public int porcentajeCaballerosPrecoces() {
        int cont = 0;

        for (Caballero c: losCaballeros) {
            if (c.esPrecoz()) {
                cont++;
            }
        }

        return cont * 100 / losCaballeros.size();
    }

    public ArrayList<Caballero> caballerosMasPoderosos() {
        ArrayList<Caballero> res = new ArrayList<>();

        for (Caballero c: losCaballeros) {
            if (c.esPoderoso()) {
                res.add(c);
            }
        }

        return res;
    }

    public void agregar(Caballero c) {
        losCaballeros.add(c);
    }
}
