package com.ecommercespring.ecommercespring.Services;

import com.ecommercespring.ecommercespring.Exceptions.NotFoundException;
import com.ecommercespring.ecommercespring.Repositories.AdminRepo;
import com.ecommercespring.ecommercespring.Repositories.ClientRepo;
import com.ecommercespring.ecommercespring.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {
    @Autowired
    ClientRepo clientRepo;

    public ClientServices(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public void addClient(Client client){
        clientRepo.save(client);
    }

    public Client findClientByEmailandPassword(Client client){
        return clientRepo.findByEmailAndPassword(client.getEmail(),client.getPassword()).orElseThrow(()-> new NotFoundException("Erreur d'authentification"));
    }

}
