package com.ChinaMarket.ECommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int requiredQuantity;
    //mapping betweenchild item and parent cart;
    @ManyToOne
    @JoinColumn
    private Cart cart;

    //mapping between child item and parent product;
    @OneToOne
    @JoinColumn
    private Product product;

    //mapping between child item and parent ordered
    @ManyToOne
    @JoinColumn
    private Ordered order;

}
