package ChuckNorris_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LuchadorTest {
    @Test
    public void TestEsChuckNorrisReturnTrue() {
        Luchador l1 = new Luchador("L1", 500, true);
        boolean resultado = l1.esChuckNorris(1000);
        assertTrue(resultado);
    }

    @Test
    public void TestEsChuckNorrisReturnFalse() {
        Luchador l1 = new Luchador("L1", 500, true);
        boolean resultado = l1.esChuckNorris(2000);
        assertFalse(resultado);
    }

    @Test
    public void TestEsInsectoReturnTrue() {
        Luchador l1 = new Luchador("L1", 400, true);
        boolean resultado = l1.esInsecto();
        assertTrue(resultado);
    }

    @Test
    public void TestEsInsectoReturnFalse() {
        Luchador l1 = new Luchador("L1", 600, true);
        boolean resultado = l1.esInsecto();
        assertFalse(resultado);
    }

    @Test
    public void TestSabeJJReturnTrue() {
        Luchador l1 = new Luchador("L1", 600, true);
        boolean resultado = l1.sabeJJ();
        assertTrue(resultado);
    }

    @Test
    public void TestSabeJJReturnFalse() {
        Luchador l1 = new Luchador("L1", 600, false);
        boolean resultado = l1.sabeJJ();
        assertFalse(resultado);
    }
}
