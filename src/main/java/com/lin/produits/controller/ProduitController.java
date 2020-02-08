package com.lin.produits.controller;

import com.lin.produits.entity.Produit;
import com.lin.produits.service.IproduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/produit")
public class ProduitController {
    @Autowired
    IproduitService produitService;

    @GetMapping
    public List<Produit> getProduit(){
        return produitService.getProduit();
    }

    @PostMapping
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }

    @PutMapping
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
    }

    @DeleteMapping("/{ref}")
    public void deleteProduit(@PathVariable String ref){
        produitService.deleteProduit(ref);
    }
}
