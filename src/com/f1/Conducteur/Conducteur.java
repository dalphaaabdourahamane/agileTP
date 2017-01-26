package com.f1.Conducteur;

import com.f1.Voiture.Voiture;

/**
 * Created by DIALLO on 26/01/2017.
 */
public class Conducteur {
    private String nom = "";
    private int anneeExperience = 1;
    private double taille = 1.5;
    private String sponsort = "";

    private Voiture voiture;

    public Conducteur() {
    }

    public Conducteur(String nom, int anneeExperience) {
        this.nom = nom;
        this.anneeExperience = (anneeExperience < 1)? 1:anneeExperience;
    }

    public Conducteur(String nom, int anneeExperience, double taille, String sponsort) {
        this.nom = nom;
        this.anneeExperience = (anneeExperience < 1)? 1:anneeExperience;
        this.taille = (taille < 1 )? 1 : (taille > 2.5)? 2.5:taille;
        this.sponsort = sponsort;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public void setAnneeExperience(int anneeExperience) {
        this.anneeExperience = (anneeExperience < 1)? 1:anneeExperience;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = (taille < 1 )? 1 : (taille > 2.5)? 2.5:taille;
    }

    public String getSponsort() {
        return sponsort;
    }

    public void setSponsort(String sponsort) {
        this.sponsort = sponsort;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) throws Exception {
        if( ! voiture.getConducteurs().contains(this)) voiture.add(this);
        this.voiture = voiture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conducteur)) return false;

        Conducteur that = (Conducteur) o;

        if (anneeExperience != that.anneeExperience) return false;
        if (taille != that.taille) return false;
        if (!nom.equals(that.nom)) return false;
        return sponsort != null ? sponsort.equals(that.sponsort) : that.sponsort == null;
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + anneeExperience;
        result = (int) (31 * result + taille);
        result = 31 * result + (sponsort != null ? sponsort.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Conducteur{" +
                "nom='" + nom + '\'' +
                ", anneeExperience=" + anneeExperience +
                ", taille=" + taille +
                ", sponsort='" + sponsort + '\'' +
                '}';
    }
}
