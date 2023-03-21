package com.ChinaMarket.ECommerce.Convertor;

import com.ChinaMarket.ECommerce.Enum.ProductStatus;
import com.ChinaMarket.ECommerce.Model.Product;
import com.ChinaMarket.ECommerce.RequestDto.ProductEntryDto;
import com.ChinaMarket.ECommerce.ResponseDto.ProductResponseDto;

public class ProductConvertor {
    public static Product ProductEntryDtoToProduct(ProductEntryDto productEntryDto){
       return Product.builder().name(productEntryDto.getName())
                .quantity(productEntryDto.getQuantity())
                .price(productEntryDto.getPrice())
                .category(productEntryDto.getCategory())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
//        return product;
    }
    public static ProductResponseDto ProductToProductResponseDto(Product product){
        return ProductResponseDto.builder().name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .productStatus(product.getProductStatus())
                .build();
//        return productResponseDto;
    }
}
