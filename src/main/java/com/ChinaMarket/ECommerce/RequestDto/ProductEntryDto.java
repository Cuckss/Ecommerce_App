package com.ChinaMarket.ECommerce.RequestDto;

import com.ChinaMarket.ECommerce.Enum.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntryDto {
    private String name;
    private int quantity;
    private int price;
    private Category category;

    private int sellerId;
}
