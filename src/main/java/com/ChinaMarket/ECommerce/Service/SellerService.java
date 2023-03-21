package com.ChinaMarket.ECommerce.Service;

import com.ChinaMarket.ECommerce.Convertor.SellerConvertor;
import com.ChinaMarket.ECommerce.RequestDto.SellerEntryDto;
import com.ChinaMarket.ECommerce.Model.Seller;
import com.ChinaMarket.ECommerce.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public String addSeller(SellerEntryDto sellerEntryDto){
      Seller seller= SellerConvertor.sellerEntryDtoToSeller(sellerEntryDto);
        sellerRepository.save(seller);
        return "Seller added successfully";
    }
    public List<Seller> viewAllSellers(){
        List<Seller>sellers=sellerRepository.findAll();
        return sellers;
    }
}
