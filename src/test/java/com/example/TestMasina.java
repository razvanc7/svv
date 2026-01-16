package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMasina {

    @Test
    public void testConstructor() {
        Masina m = new Masina("Dacia");

        assertEquals("Dacia", m.marca);
        assertEquals(0, m.roti.size());
    }

    @Test
    public void testAdaugaRoata() throws PreaMulteRoti {
        Masina m = new Masina("BMW");
        Roata r = new Roata(10);

        m.adaugaRoata(r);

        assertEquals(1, m.roti.size());
    }

    @Test
    public void testAdaugaPatruRoti() throws PreaMulteRoti {
        Masina m = new Masina("Audi");

        m.adaugaRoata(new Roata(10));
        m.adaugaRoata(new Roata(10));
        m.adaugaRoata(new Roata(10));
        m.adaugaRoata(new Roata(10));

        assertEquals(4, m.roti.size());
    }


    @Test
    public void testCalculeazaArieTotala() throws PreaMulteRoti {
        Masina m = new Masina("Skoda");

        m.adaugaRoata(new Roata(10));
        m.adaugaRoata(new Roata(5));  

        double expected = (3.14 * 3.14 * 10) + (3.14 * 3.14 * 5);
        double actual = m.calculeazaArieTotala();

        assertEquals(expected, actual, 0.0001);
    }
}
