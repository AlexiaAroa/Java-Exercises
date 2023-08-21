package BatmansDelMercosur_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BatmanTest {

    @Test
    public void TestIrALaPanaderia() {
        Batman b1 = new Batman();
        b1.irALaPanaderia();
        assertEquals(6, b1.getCantFacturasEnSangre());
        b1.irALaPanaderia();
        b1.irALaPanaderia();
        b1.irALaPanaderia();
        assertEquals(24, b1.getCantFacturasEnSangre());
    }

    @Test
    public void TestEsKryngoWithBatmanKryngo() {
        // Es Kryngo
        Batman b1 = new Batman();
        b1.setEsDeKripton(true);
        b1.setSoloHablaIngles(true);
        assertTrue(b1.esKryngo());
    }

    @Test
    public void TestEsKryngoWithoutBatmanKryngo() {
        // No es Kryngo
        Batman b1 = new Batman();
        b1.setEsDeKripton(false);
        b1.setSoloHablaIngles(true);
        assertFalse(b1.esKryngo());

        Batman b2 = new Batman();
        b2.setEsDeKripton(false);
        b2.setSoloHablaIngles(false);
        assertFalse(b2.esKryngo());
    }

    @Test
    public void TestNecesitaTraductorRunsOk() {
        Batman b1 = new Batman();
        b1.setSoloHablaIngles(true);
        assertTrue(b1.necesitaTraductor());

        Batman b2 = new Batman();
        b2.setSoloHablaIngles(false);
        assertFalse(b2.necesitaTraductor());
    }

    @Test
    public void TestTieneAltoNivelFactEnSangreRunsOk() {
        Batman b1 = new Batman();
        b1.setCantFacturasEnSangre(1600);
        assertTrue(b1.tieneAltoNivelFactEnSangre());

        Batman b2 = new Batman();
        b1.setCantFacturasEnSangre(1000);
        assertFalse(b2.tieneAltoNivelFactEnSangre());
    }
}
