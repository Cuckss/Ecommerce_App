package com.ChinaMarket.ECommerce.Model;

import com.ChinaMarket.ECommerce.Enum.Category;
import com.ChinaMarket.ECommerce.Enum.ProductStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private int price;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    @Enumerated(value = EnumType.STRING)
    private ProductStatus productStatus;

    //setting child product wrt parent seller
    @ManyToOne
    @JoinColumn
    private Seller seller;

    //mapping parent product wrt child item
    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    private Item item;



}
