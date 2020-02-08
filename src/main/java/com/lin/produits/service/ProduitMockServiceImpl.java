package com.lin.produits.service;

import com.lin.produits.entity.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProduitMockServiceImpl implements IproduitService {
    List<Produit> produits;



    public ProduitMockServiceImpl(){
       produits = new ArrayList<Produit>();


    }
    @Override
    public List<Produit> getProduit() {
        return produits;
    }


    @Override
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    @Override
    public void updateProduit(Produit produit) {
        produits.remove(produit);
        produits.add(produit);

    }

    @Override
    public void deleteProduit(String ref){
        Produit produit = new Produit();
        produit.setRef(ref);
        produits.remove(produit);
    }
}
