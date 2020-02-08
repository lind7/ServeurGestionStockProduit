package com.lin.produits.entity;

import java.util.Objects;

public class Produit {
    private String ref;
    private int quantite;
    private long prixUnitaire;

    public Produit(String ref, int quantite, long prixUnitaire) {
        this.ref = ref;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public long getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(long prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Produit() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return ref.equals(produit.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref);
    }
}
