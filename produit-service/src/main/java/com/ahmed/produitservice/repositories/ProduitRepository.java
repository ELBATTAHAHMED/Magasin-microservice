package com.ahmed.produitservice.repositories;

import com.ahmed.produitservice.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


//@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
