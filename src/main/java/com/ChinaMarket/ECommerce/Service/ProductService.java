package com.ChinaMarket.ECommerce.Service;

import com.ChinaMarket.ECommerce.Convertor.ProductConvertor;
import com.ChinaMarket.ECommerce.Exception.SellerNotFoundException;
import com.ChinaMarket.ECommerce.RequestDto.ProductEntryDto;
import com.ChinaMarket.ECommerce.Enum.Category;
import com.ChinaMarket.ECommerce.Model.Product;
import com.ChinaMarket.ECommerce.Model.Seller;
import com.ChinaMarket.ECommerce.Repository.ProductRepository;
import com.ChinaMarket.ECommerce.Repository.SellerRepository;
import com.ChinaMarket.ECommerce.ResponseDto.ProductResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
@Autowired
    ProductRepository productRepository;
@Autowired
    SellerRepository sellerRepository;
public String addProduct(ProductEntryDto productEntryDto) throws SellerNotFoundException {
    Seller seller;
    try {
        seller = sellerRepository.findById(productEntryDto.getSellerId()).get();
    }catch(Exception e){
        throw new SellerNotFoundException("Invalid Seller Id");
    }
    Product product= ProductConvertor.ProductEntryDtoToProduct(productEntryDto);
    product.setSeller(seller);
//    List<Product> productList=seller.getProducts();
//    productList.add(product);
//    seller.setProducts(productList);
    seller.getProducts().add(product);
    sellerRepository.save(seller);
//    ProductResponseDto productResponseDto=ProductConvertor.ProductToProductResponseDto(product);
//    return productResponseDto;
return "product added succesfully";
}

public List<ProductResponseDto> allProductsFromCategory(Category category){
    List<Product>productList=productRepository.getAllProductByCategory(category);
    List<ProductResponseDto>productResponseDtoList=new ArrayList<>();
   for(Product product:productList){
       ProductResponseDto productResponseDto=ProductConvertor.ProductToProductResponseDto(product);
       productResponseDtoList.add(productResponseDto);
   }
   return productResponseDtoList;
}
}
