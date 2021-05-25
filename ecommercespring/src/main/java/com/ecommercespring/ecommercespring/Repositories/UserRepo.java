package com.ecommercespring.ecommercespring.Repositories;


import com.ecommercespring.ecommercespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
