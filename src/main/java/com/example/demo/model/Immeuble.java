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

    public static void main(String[] args) {
        Quartier quartier = new Quartier(1, "Ivandry");
        Immeuble immeuble = new Immeuble(1, "Jade", 5);
        quartier.ajouterImmeuble(immeuble);

        Appartement appartement = new Appartement(1, "Appart à louer", "3 pièces", 500.0, Statut.LIBRE, immeuble);
        immeuble.ajouterAppartement(appartement);

        boolean estDansLeQuartier = quartier.contientAppartement(appartement);
        System.out.println("L'appartement est dans le quartier : " + estDansLeQuartier);

        int nombreAppartements = quartier.compterAppartements();
        System.out.println("Nombre d'appartements dans le quartier : " + nombreAppartements);
    }
}
