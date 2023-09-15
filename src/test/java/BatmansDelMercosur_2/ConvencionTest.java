package BatmansDelMercosur_2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConvencionTest {

    @Test
    public void TestLosQueNecesitanTraductorRunsOk() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        batman.setSoloHablaIngles(true);
        batman2.setSoloHablaIngles(true);

        ArrayList<Batman> solucionEsperada = new ArrayList<Batman>();
        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        solucionEsperada.add(batman);
        solucionEsperada.add(batman2);

        assertEquals(solucionEsperada, unaConvencion.losQueNecesitanTraductor());
    }

    @Test
    public void TestSiAlgunBatmanNecesitaTraductorRunsOk2() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        batman.setSoloHablaIngles(true);
        batman2.setSoloHablaIngles(false);

        ArrayList<Batman> solucionEsperada = new ArrayList<>();
        solucionEsperada.add(batman);

        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        assertEquals(solucionEsperada, unaConvencion.losQueNecesitanTraductor());
    }

    @Test
    public void TestHayBatmanConAltoNivelFenSRunsOk() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        batman.setCantFacturasEnSangre(1600);
        batman2.setCantFacturasEnSangre(3000);

        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        assertTrue(unaConvencion.hayBatmanConAltoNivelFenS());
    }

    @Test
    public void TestHayBatmanConAltoNivelFenSRunsOk2() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        batman.setCantFacturasEnSangre(1300);
        batman2.setCantFacturasEnSangre(1000);

        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        assertFalse(unaConvencion.hayBatmanConAltoNivelFenS());
    }

    @Test
    public void TestElQueComioMasFacturasRunsOk() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        Batman batman3 = new Batman();
        batman.setCantFacturasEnSangre(800);
        batman2.setCantFacturasEnSangre(900);
        batman3.setCantFacturasEnSangre(1000);

        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        unaConvencion.inscribir(batman3);

        assertEquals(batman3, unaConvencion.elQueComioMasFacturas());
    }
    @Test
    public void TestElQueComioMasFacturasRunsOk2() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        Batman batman3 = new Batman();
        batman.setCantFacturasEnSangre(800);
        batman2.setCantFacturasEnSangre(1000);
        batman3.setCantFacturasEnSangre(900);

        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        unaConvencion.inscribir(batman3);
        assertEquals(batman2, unaConvencion.elQueComioMasFacturas());
    }

    @Test
    public void TestElQueComioMasFacturasRunsOk3() {
        Batman batman = new Batman();
        Batman batman2 = new Batman();
        Batman batman3 = new Batman();
        batman.setCantFacturasEnSangre(1000);
        batman2.setCantFacturasEnSangre(1000);
        batman3.setCantFacturasEnSangre(1000);

        Convencion unaConvencion = new Convencion();
        unaConvencion.inscribir(batman);
        unaConvencion.inscribir(batman2);
        unaConvencion.inscribir(batman3);

        assertEquals(batman, unaConvencion.elQueComioMasFacturas());
    }

}