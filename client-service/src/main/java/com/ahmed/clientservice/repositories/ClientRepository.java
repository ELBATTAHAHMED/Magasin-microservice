package com.ahmed.clientservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ahmed.clientservice.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

