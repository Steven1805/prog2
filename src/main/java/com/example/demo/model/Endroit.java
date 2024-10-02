package com.example.demo.model;

abstract class Endroit {
    private int id;
    private String nom;

    public Endroit(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public abstract int compterAppartements();
}
