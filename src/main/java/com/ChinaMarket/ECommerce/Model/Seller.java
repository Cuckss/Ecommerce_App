package com.ChinaMarket.ECommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sellers")
@Builder
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(unique = true)
    private String mobNo;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String panNo;

    //setting parent wrt child product
     @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    private List<Product> products=new ArrayList<>();

}
