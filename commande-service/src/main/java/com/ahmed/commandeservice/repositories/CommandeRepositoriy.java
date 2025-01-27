package com.ahmed.commandeservice.repositories;

import com.ahmed.commandeservice.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommandeRepositoriy extends JpaRepository<Commande, Long>{
        }