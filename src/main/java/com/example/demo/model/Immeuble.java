package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

class Immeuble extends Endroit {
    private int nombreEtages;
    private List<Appartement> appartements;

    public Immeuble(int id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = new ArrayList<>();
    }

    public int getNombreEtages() {
        return nombreEtages;
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }
}
