package com.ChinaMarket.ECommerce.ResponseDto;

import com.ChinaMarket.ECommerce.Enum.Category;
import com.ChinaMarket.ECommerce.Enum.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
    private String name;
    private int price;
    private int quantity;
    private ProductStatus productStatus;
}
