package com.ecommercespring.ecommercespring.Repositories;


import com.ecommercespring.ecommercespring.entities.Admin;
import com.ecommercespring.ecommercespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
