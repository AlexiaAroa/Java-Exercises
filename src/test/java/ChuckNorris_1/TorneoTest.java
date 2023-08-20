package ChuckNorris_1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TorneoTest {

    @Test
    public void TestLosChuckNorrisRunsOk() {
        ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
        Luchador l1 = new Luchador("L1", 500, false);
        Luchador l2 = new Luchador("L2", 600, true);
        Luchador l3 = new Luchador("L3", 100, false);
        Luchador l4 = new Luchador("L4", 900, true);
        resultadoEsperado.add(l1);
        resultadoEsperado.add(l2);
        resultadoEsperado.add(l4);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        ArrayList<Luchador> resultadoOBtenido = t1.losChuckNorris(1000);
        assertEquals(resultadoEsperado, resultadoOBtenido);
    }

    @Test
    public void TestLosChuckNorrisWithoutChuckNorris() {
        ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
        Luchador l1 = new Luchador("L1", 50, false);
        Luchador l2 = new Luchador("L2", 60, true);
        Luchador l3 = new Luchador("L3", 100, false);
        Luchador l4 = new Luchador("L4", 90, true);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        ArrayList<Luchador> resultadoOBtenido = t1.losChuckNorris(1000);
        assertEquals(resultadoEsperado, resultadoOBtenido);
    }

    @Test
    public void TestLosInsectosRunsOk() {
        ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
        Luchador l1 = new Luchador("L1", 500, false);
        Luchador l2 = new Luchador("L2", 600, true);
        Luchador l3 = new Luchador("L3", 100, false);
        Luchador l4 = new Luchador("L4", 90, true);
        resultadoEsperado.add(l3);
        resultadoEsperado.add(l4);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        ArrayList<Luchador> resultadoOBtenido = t1.losInsectos();
        assertEquals(resultadoEsperado, resultadoOBtenido);
    }

    @Test
    public void TestLosInsectosWithoutInsectos() {
        ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
        Luchador l1 = new Luchador("L1", 500, false);
        Luchador l2 = new Luchador("L2", 600, true);
        Luchador l3 = new Luchador("L3", 700, false);
        Luchador l4 = new Luchador("L4", 900, true);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        ArrayList<Luchador> resultadoOBtenido = t1.losInsectos();
        assertEquals(resultadoEsperado, resultadoOBtenido);
    }

    @Test
    public void TestHayUnJJRunsOk() {
        Luchador l1 = new Luchador("L1", 500, false);
        Luchador l2 = new Luchador("L2", 600, true);
        Luchador l3 = new Luchador("L3", 700, false);
        Luchador l4 = new Luchador("L4", 900, true);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        boolean resultadoOBtenido = t1.hayUnJJ();
        assertTrue(resultadoOBtenido);
    }

    @Test
    public void TestHayUnJJWithoutJJs() {
        Luchador l1 = new Luchador("L1", 500, false);
        Luchador l2 = new Luchador("L2", 600, false);
        Luchador l3 = new Luchador("L3", 700, false);
        Luchador l4 = new Luchador("L4", 900, false);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        boolean resultadoOBtenido = t1.hayUnJJ();
        assertFalse(resultadoOBtenido);
    }

    @Test
    public void TestCantidadDeJJRunsOk() {
        Luchador l1 = new Luchador("L1", 500, false);
        Luchador l2 = new Luchador("L2", 600, true);
        Luchador l3 = new Luchador("L3", 700, true);
        Luchador l4 = new Luchador("L4", 900, true);

        Torneo t1 = new Torneo();
        t1.inscribir(l1);
        t1.inscribir(l2);
        t1.inscribir(l3);
        t1.inscribir(l4);

        int resultadoOBtenido = t1.cantidadDeJJ();
        assertEquals(3, resultadoOBtenido);
    }

    @Test
    public void inscribir() {
    }
}