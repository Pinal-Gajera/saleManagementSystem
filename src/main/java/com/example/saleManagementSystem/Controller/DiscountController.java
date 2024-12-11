package com.example.saleManagementSystem.Controller;

import com.example.saleManagementSystem.Service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("discount")
public class DiscountController {
    @Autowired
    DiscountService discountService;

//    @GetMapping("getdiscount")
//    public List<discountDTO> getOrderItemsWithDiscountedPrice() {
//        return discountService.getItemsWithDiscountedPrice();
//    }
//@GetMapping("getdiscount")
//    public List<Object[]> getDiscountedPrices() {
//        return discountService.getDiscountedPrices();
//    }

}
