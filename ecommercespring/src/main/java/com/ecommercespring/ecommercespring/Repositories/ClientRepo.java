package com.ecommercespring.ecommercespring.Repositories;

import com.ecommercespring.ecommercespring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client,Long> {

    Optional<Client> findByEmailAndPassword(String email, String password);
}
