package com.example.demo.model;

public class Main {
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
