package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(int id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public List<Immeuble> getImmeubles() {
        return immeubles;
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }
    
    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.getAppartements().contains(appartement)) {
                return true;
            }
        }
        return false;
    }
}
