package com.example.demo.model;

class Appartement {
    private int id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Statut statut;
    private Endroit endroit;

    public Appartement(int id, String titre, String description, double loyerMensuel, Statut statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public double getLoyerMensuel() {
        return loyerMensuel;
    }

    public Statut getStatut() {
        return statut;
    }

    public Endroit getEndroit() {
        return endroit;
    }
}
