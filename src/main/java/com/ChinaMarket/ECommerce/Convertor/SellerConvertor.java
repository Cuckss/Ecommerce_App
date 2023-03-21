package com.ChinaMarket.ECommerce.Convertor;

import com.ChinaMarket.ECommerce.Model.Seller;
import com.ChinaMarket.ECommerce.RequestDto.SellerEntryDto;

public class SellerConvertor {
    public static Seller sellerEntryDtoToSeller(SellerEntryDto sellerEntryDto){
        Seller seller=Seller.builder().name(sellerEntryDto.getName())
                .email(sellerEntryDto.getEmail())
                .mobNo(sellerEntryDto.getMobNo())
                .panNo(sellerEntryDto.getPanNo())
                .build();
        return seller;
    }
}
