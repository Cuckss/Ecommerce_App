package com.ChinaMarket.ECommerce.Controller;

import com.ChinaMarket.ECommerce.Enum.Category;
import com.ChinaMarket.ECommerce.RequestDto.ProductEntryDto;
import com.ChinaMarket.ECommerce.ResponseDto.ProductResponseDto;
import com.ChinaMarket.ECommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody ProductEntryDto productEntryDto){

       String response;
        try{
         response = productService.addProduct(productEntryDto);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
    @GetMapping("/get/productCategory/{category}")
    public List<ProductResponseDto>allProductsFromCategory(@PathVariable("category") Category category){
     return productService.allProductsFromCategory(category);
      }
}
