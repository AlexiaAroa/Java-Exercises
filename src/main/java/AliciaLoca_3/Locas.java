package AliciaLoca_3;

import java.util.ArrayList;

public class Locas {
    private ArrayList<Persona> personas = new ArrayList<>();

    public int cantidadPersonasLindas() {
        int cont = 0;
        for (Persona p: personas) {
            if (p.esPersonaLinda()) {
                cont++;
            }
        }

        return cont;
    }

    public boolean hayPersonaNormal() {
        for (Persona p: personas) {
            if (p.esPersonaNormal()) {
                return true;
            }
        }

        return false;
    }

    public void agregar(Persona p1) {
        personas.add(p1);
    }
}
