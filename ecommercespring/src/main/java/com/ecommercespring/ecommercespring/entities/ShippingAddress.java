package com.ecommercespring.ecommercespring.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String streetAddress;
    String city;
    String state;
    String zipCode;

    @ManyToOne
    @JoinColumn(name="owner")
    Client addressOwner;

}
