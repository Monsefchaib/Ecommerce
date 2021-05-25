package com.ecommercespring.ecommercespring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Client extends User {

    @JsonIgnore
    @Column(name="Client_Shipping_Adresses")
    @OneToMany(mappedBy="addressOwner",cascade=CascadeType.ALL)
    List<ShippingAddress> shippingAdress;

    @JsonIgnore
    @Column(name="Client_CreditCards")
    @OneToMany(mappedBy="owner",cascade=CascadeType.ALL)
    List<CreditCard> creditCard;
}
