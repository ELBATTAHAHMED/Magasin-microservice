package com.ahmed.commandeservice.web;


import com.ahmed.commandeservice.modele.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "client-service", url = "http://localhost:9091")
public interface ClientOpenFeign {

    @GetMapping("/clients/{id}")
    Client getClient(@PathVariable("id") Long id);

    @GetMapping("/clients")
    List<Client>getClients();
}
