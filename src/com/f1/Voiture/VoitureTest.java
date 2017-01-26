package com.f1.Voiture;

import com.f1.Conducteur.Conducteur;
import com.f1.Equipe.Equipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by DIALLO on 26/01/2017.
 */
class VoitureTest {
    @Test
    void AddConducteur() {
        Voiture voiture = new Voiture("Mercedes", 50, "ferrarie");
        voiture.setNbPlace(1);
        Conducteur conducteur = new Conducteur("jeremy", 10, 1.8, "Mercedes");
        Conducteur conducteur2 = new Conducteur("john", 10, 1.8, "Mercedes");
        Throwable exception = assertThrows(IllegalStateException.class, () -> {
            voiture.add(conducteur);
            voiture.add(conducteur2);
        });
        assertEquals("Plus de place", exception.getMessage());

    }

    @Test
    void AddVoiture (){
        Voiture voiture = new Voiture("Mercedes",50,"ferrarie");
        Conducteur conducteur = new Conducteur("jeremy",10,1.8,"Mercedes");
        try {
            voiture.add(conducteur);
        } catch (Exception ignored) {
        }
        assertEquals(conducteur,voiture.getConducteurs().get(0));
    }

    @Test()
    void AddConducteurFAiled() {
        Voiture voiture = new Voiture("Mercedes",500,2,"Mercedes",200,100);

        Throwable exception = assertThrows(IllegalStateException.class, () -> {
            voiture.add(new Conducteur("jeremy",10,1.8,"Mercedes"));
            voiture.add(new Conducteur("john",10,1.8,"Mercedes"));
            voiture.add(new Conducteur("alpha",10,1.8,"Mercedes"));
        });
        assertEquals("Plus de place", exception.getMessage());
    }

    @Test
    void getPuissance() {

    }

    @Test
    void setPuissance() {

    }

    @Test
    void getNbPlace() {

    }

    @Test
    void setNbPlace() {

    }

    @Test
    void getModel() {

    }

    @Test
    void setModel() {

    }

    @Test
    void getVitesseMax() {

    }

    @Test
    void svreatVitesseMax() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Voiture voiture = new Voiture("Mercedes",500,2,"Mercedes",100,100);
        });
        assertEquals("Ici c'est la formule 1 rentre chez toi", exception.getMessage());
    }

    @Test
    void setVitesse() {
        Voiture voiture = new Voiture("Mercedes",500,2,"Mercedes",200,100);
        voiture.setEssence(8);
        assertTrue(voiture.getVitesseMax() == 150);

    }

}