package com.lin.produits.service;

import com.lin.produits.entity.Produit;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
public interface IproduitService {
    List<Produit> getProduit();
    void addProduit(Produit produit);
    void updateProduit(Produit produit);
    void deleteProduit(String ref);
}
