package com.ChinaMarket.ECommerce.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerEntryDto {
    private String name;
    private String mobNo;
    private String email;
    private String panNo;
}
