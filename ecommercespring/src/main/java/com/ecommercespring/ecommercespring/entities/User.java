package com.ecommercespring.ecommercespring.entities;

import lombok.Data;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public @Data abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fullname;
    String email;
    String password;
    String address;
    String phoneNumber;
    String role;
}
