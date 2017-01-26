package com.f1.Conducteur;

import com.f1.Voiture.Voiture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by DIALLO on 26/01/2017.
 */
class ConducteurTest {
    @Test
    void getNom() {
        Conducteur conducteur = new Conducteur("John",10,1.8,"Mercedes");
        assertAll("Conducteur",
                () -> assertEquals("John", conducteur.getNom()),
                () -> assertEquals(10, conducteur.getAnneeExperience()),
                () -> assertEquals("Mercedes", conducteur.getSponsort()),
                () -> assertEquals(1.8, conducteur.getTaille())
        );
    }

    @Test
    void checkNom() {
        Conducteur conducteur = new Conducteur("jeremy",10,1.8,"Mercedes");
        Conducteur conducteur2 = new Conducteur("Alpha",10,1.8,"Mercedes");
        assertNotEquals(conducteur,conducteur2);
    }

    @Test
    void setAnneeExperience() {
        Conducteur conducteur = new Conducteur("jeremy",0,1.8,"Mercedes");
        assertTrue(conducteur.getAnneeExperience() > 0);
    }

    @Test
    void setTaille() {
        Conducteur conducteur = new Conducteur("jeremy",0,30,"Mercedes");
        assertTrue(conducteur.getTaille() <= 2.5 && conducteur.getTaille() >=1);
    }


}