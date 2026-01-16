package com.example;

public class App 
{
    public static void main( String[] args ) throws PreaMulteRoti
    {
        
         Roata r1 = new Roata(17);
         Roata r2 = new Roata(16);
         Roata r3 = new Roata(14);
         Roata r4 = new Roata(15);

         Masina masina = new Masina("golf 5");

         masina.adaugaRoata(r1);
         masina.adaugaRoata(r2);
         masina.adaugaRoata(r3);
         masina.adaugaRoata(r4);

         double arieTotala = masina.calculeazaArieTotala();
    }
}
