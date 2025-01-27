package com.ahmed.commandeservice.web;


import com.ahmed.commandeservice.entities.Commande;
import com.ahmed.commandeservice.modele.Client;
import com.ahmed.commandeservice.modele.Produit;
import com.ahmed.commandeservice.repositories.CommandeRepositoriy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeControlleur {

    private final ProduitOpenFeign produitOpenFeign;
    private final ClientOpenFeign clientOpenFeign;
    CommandeRepositoriy commandeRepositoriy;

    public CommandeControlleur(CommandeRepositoriy commandeRepositoriy,
                               ProduitOpenFeign produitOpenFeign,
                               ClientOpenFeign clientOpenFeign) {
        this.commandeRepositoriy = commandeRepositoriy;
        this.produitOpenFeign = produitOpenFeign;
        this.clientOpenFeign = clientOpenFeign;
    }


    @GetMapping("/Commandes")
    public List<Commande> getCommandes() {
        List<Commande> commandes = commandeRepositoriy.findAll();
        for(Commande c: commandes) {
            Produit p = produitOpenFeign.getProduit(c.getIdProduit());
            c.setProduit(p);
            Client cl = clientOpenFeign.getClient(c.getIdClient());
            c.setClient(cl);
        }
        return commandes;
    }

    @GetMapping("/Commande/{id}")
    public Commande getCommandeById(@PathVariable Long id) {
        return commandeRepositoriy.findById(id).get();
    }

    @PostMapping("/Commande")
    public Commande addCommande(@RequestBody Commande com1) {
        return commandeRepositoriy.save(com1);
    }
}