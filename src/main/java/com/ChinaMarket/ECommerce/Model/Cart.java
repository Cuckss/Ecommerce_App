package com.ChinaMarket.ECommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cartTotal;
    //setting up child cart wrt parent customer;
    @OneToOne
    @JoinColumn
    private Customer customer;

    //mapping between parent cart and child item
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<Item> items=new ArrayList<>();

}
