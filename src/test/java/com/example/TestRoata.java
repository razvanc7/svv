package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRoata {

    @Test
    public void testConstructor() {
        Roata r = new Roata(10);
        assertEquals(10, r.raza);
    }

    @Test
    public void testCalculeazaArie() {
        Roata r = new Roata(10);

        double rezultatAsteptat = 3.14 * 3.14 * 10;
        double rezultatObtinut = r.calculeazaArie();

        assertEquals(rezultatAsteptat, rezultatObtinut, 0.0001);
    }
}
