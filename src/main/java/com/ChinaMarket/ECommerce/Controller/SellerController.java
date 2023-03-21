package com.ChinaMarket.ECommerce.Controller;

import com.ChinaMarket.ECommerce.RequestDto.SellerEntryDto;
import com.ChinaMarket.ECommerce.Model.Seller;
import com.ChinaMarket.ECommerce.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {
@Autowired
SellerService sellerService;
@PostMapping("/add")
public ResponseEntity<String>addSeller(@RequestBody SellerEntryDto sellerEntryDto){
    String response= sellerService.addSeller(sellerEntryDto);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
}
@GetMapping
    public ResponseEntity<List<Seller>> viewAllSellers(){
    List<Seller> allSellers=sellerService.viewAllSellers();
    return new ResponseEntity<>(allSellers,HttpStatus.BAD_REQUEST);
}

}
