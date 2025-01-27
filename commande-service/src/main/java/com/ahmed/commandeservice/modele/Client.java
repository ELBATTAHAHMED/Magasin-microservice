package com.ahmed.commandeservice.modele;


import lombok.*;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private Long idClient;
    private String nom;
    private String age;
    private String ville;
}