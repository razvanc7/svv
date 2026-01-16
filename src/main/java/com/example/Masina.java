package com.example;
import java.util.*;

public class Masina{

    public String marca;
    public List<Roata> roti;

    public Masina(String marca){

        this.marca = marca;
        this.roti = new ArrayList<>();

    }

    public void adaugaRoata(Roata roata) throws PreaMulteRoti {

        if (roti.size() >= 4) {
            throw new PreaMulteRoti("prea multe roti");
        }

        roti.add(roata);

    }

    public double calculeazaArieTotala() {

        double suma = 0;

        for (Roata r : roti) {
            suma += r.calculeazaArie();
        }

        return suma;
    }
}