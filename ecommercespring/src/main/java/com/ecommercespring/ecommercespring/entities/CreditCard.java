package com.ecommercespring.ecommercespring.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String cardNumber;
    String cardHolderName;
    String expirationDate;
    int cvcCode;

    @ManyToOne
    @JoinColumn(name="owner")
    Client owner;

}
