package com.ChinaMarket.ECommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordered")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ordered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date orderDate;
    private int totalCost;
    private int deliveryCharge;
    private String cardUsedForPayment;
    //mapping between child order and parent customer;
    @ManyToOne
    @JoinColumn
    private Customer customer;


   // mapping between parent ordered and child item
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    List<Item> items=new ArrayList<>();


}
