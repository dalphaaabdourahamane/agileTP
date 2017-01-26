package com.f1.Equipe;

import com.f1.Conducteur.Conducteur;
import com.f1.Voiture.Voiture;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DIALLO on 26/01/2017.
 */
public class Equipe {
    private final List<Voiture> voitures;
    private final List<Conducteur> conducteurs;
    private int stockDeCarburant; //l
    private String nom;

    public Equipe(int stockDeCarburant, String nom) {
        if (stockDeCarburant <= 0) throw new IllegalArgumentException("Pas de carburant negatif");
        this.stockDeCarburant = stockDeCarburant;
        this.nom = nom;
        this.voitures = new LinkedList<>();
        this.conducteurs = new LinkedList<>();
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void addVoiture(Voiture voiture ) {
        this.voitures.add(voiture);
    }

    public List<Conducteur> getConducteurs() {
        return conducteurs;
    }

    public void addConducteur(Conducteur conducteur) {
        this.conducteurs.add(conducteur);
    }

    public int getStockDeCarburant() {
        return stockDeCarburant;
    }

    public void setStockDeCarburant(int stockDeCarburant) {
        if (stockDeCarburant <= 0) throw new IllegalArgumentException("Pas de carburant negatif");
        this.stockDeCarburant = stockDeCarburant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
