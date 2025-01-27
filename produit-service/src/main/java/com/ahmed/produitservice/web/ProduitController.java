package com.ahmed.produitservice.web;

import com.ahmed.produitservice.repositories.ProduitRepository;
import com.ahmed.produitservice.entities.Produit;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class
ProduitController {
    ProduitRepository produitRepository;

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @GetMapping("/produits")
    public List<Produit> allProduits(){

        return produitRepository.findAll();
    }


    @GetMapping("/produits/{id}")
    public Produit aProduit(@PathVariable Long idProduit){
        return produitRepository.findById(idProduit).get();
    }

    @PostMapping("/produit")
    public void addproduit(@RequestBody Produit p1){
        produitRepository.save(p1);
    }

}

