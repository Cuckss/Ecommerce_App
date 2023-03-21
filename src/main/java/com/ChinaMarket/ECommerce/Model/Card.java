package com.ChinaMarket.ECommerce.Model;

import com.ChinaMarket.ECommerce.Enum.CardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cards")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String cardNo;
    @Column(unique = true)
    private int cvv;
    @Enumerated(value = EnumType.STRING)
    private CardType cardType;

    //setting child card wrt parent customer
    @ManyToOne
    @JoinColumn
    private Customer customer;

}
