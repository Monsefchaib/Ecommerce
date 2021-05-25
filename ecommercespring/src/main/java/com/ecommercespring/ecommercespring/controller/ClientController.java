package com.ecommercespring.ecommercespring.controller;

import com.ecommercespring.ecommercespring.Services.ClientServices;
import com.ecommercespring.ecommercespring.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientServices clientServices;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addClient(@RequestBody Client client){
        clientServices.addClient(client);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    public Client login(@RequestBody Client client){
       Client oldClient= clientServices.findClientByEmailandPassword(client);
        return oldClient;
    }

}
