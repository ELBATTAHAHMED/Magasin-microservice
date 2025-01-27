package com.ahmed.commandeservice.modele;


import lombok.*;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Produit {
    private Long idProduit;
    private String intitule;
    private Double prix;
}
