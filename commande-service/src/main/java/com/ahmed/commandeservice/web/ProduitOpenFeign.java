package com.ahmed.commandeservice.web;

import com.ahmed.commandeservice.modele.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "produit-service", url = "http://localhost:9092")
public interface ProduitOpenFeign {

    @GetMapping("/produits/{id}")
    Produit getProduit(@PathVariable("id") Long id);

    @GetMapping("/produits")
    List<Produit> getProduits();

}
