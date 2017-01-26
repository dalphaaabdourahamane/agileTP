package com.f1.Voiture;

import com.f1.Conducteur.Conducteur;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DIALLO on 26/01/2017.
 */
public class Voiture {
    private String marque = "";
    private final int puissance; //chevaux
    private int nbPlace = 1;
    private String model = "";
    private int vitesseMax = 300;
    private int essence = 100; //en pourcentage
    private final List<Conducteur> conducteurs;

    public Voiture(String marque, int puissance, int nbPlace, String model, int vitesseMax, int essence) {
        this.marque = marque;
        this.puissance = puissance;
        this.nbPlace = nbPlace;
        this.model = model;
        this.vitesseMax = vitesseMax;
        this.essence = essence;
        conducteurs = new LinkedList<>();
    }

    public Voiture(String marque, int puissance, String model) {
        this.marque = marque;
        this.puissance = puissance;
        this.model = model;
        conducteurs = new LinkedList<>();
    }

    public Voiture(String marque, int puissance) {
        this.marque = marque;
        this.puissance = puissance;
        conducteurs = new LinkedList<>();
    }

    public Voiture() {
        puissance = 300;
        conducteurs = new LinkedList<>();
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = (vitesseMax > 300)? 300 :vitesseMax;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
        if(this.essence <10) this.vitesseMax = 50;
    }

    public List<Conducteur> getConducteurs() {
        return conducteurs;
    }

    public void add(Conducteur conducteur) throws Exception {
       if(this.nbPlace == this.conducteurs.size()) throw new IllegalStateException("Plus de place");
        this.conducteurs.add(conducteur);
        conducteur.setVoiture(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voiture)) return false;

        Voiture voiture = (Voiture) o;

        if (puissance != voiture.puissance) return false;
        if (nbPlace != voiture.nbPlace) return false;
        if (vitesseMax != voiture.vitesseMax) return false;
        if (!marque.equals(voiture.marque)) return false;
        return model.equals(voiture.model);
    }

    @Override
    public int hashCode() {
        int result = marque.hashCode();
        result = 31 * result + puissance;
        result = 31 * result + nbPlace;
        result = 31 * result + model.hashCode();
        result = 31 * result + vitesseMax;
        return result;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", puissance=" + puissance +
                ", nbPlace=" + nbPlace +
                ", model='" + model + '\'' +
                ", vitesseMax=" + vitesseMax +
                '}';
    }
}
