package com.f1.Equipe;

import com.f1.Conducteur.Conducteur;
import com.f1.Voiture.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by DIALLO on 26/01/2017.
 */
class EquipeTest {
    @Test
    void add() {
        Voiture voiture = new Voiture("Mercedes",500,2,"Mercedes",200,100);
        Conducteur conducteur = new Conducteur("Alpha",10,1.8,"Mercedes");
        Equipe equipe = new Equipe(200,"Future");

        equipe.addConducteur(conducteur);

        equipe.addVoiture(voiture);

        assertAll("Equipe",
                () -> assertEquals(conducteur, equipe.getConducteurs().get(0)),
                () -> assertTrue(equipe.getVoitures().contains(voiture)),
                () -> assertEquals("Future", equipe.getNom())
        );

    }

    @Test
    void getConducteurs() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Equipe equipe = new Equipe(-200,"Future");

        });
        assertEquals("Pas de carburant negatif", exception.getMessage());
    }

}