package com.ChinaMarket.ECommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String mobNo;

    //setting parent customer wrt child card
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Card> cards=new ArrayList<>();

    //setting up the parent customer wrt child cart;
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Cart cart;

    //mapping the parent customer wrt child order;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Ordered>orders=new ArrayList<>();
}
