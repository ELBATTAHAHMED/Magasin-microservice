package com.ahmed.commandeservice.entities;



import com.ahmed.commandeservice.modele.Client;
import com.ahmed.commandeservice.modele.Produit;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private Integer quantite;
    private Long idProduit;
    private Long idClient;
    @Transient
    private Produit produit;

    @Transient
    private Client client;


}