package com.example.saleManagementSystem.Service;

import com.example.saleManagementSystem.Repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
   @Autowired
    DiscountRepository discountRepository;

//    public List<discountDTO> getItemsWithDiscountedPrice() {
//        List<Object[]> results = discountRepository.findOrderItemsWithDiscountedPrice();
//        List<discountDTO> orderItems = new ArrayList<>();
//
//        for (Object[] result : results) {
//            discountDTO orderItemDTO = new discountDTO();
//            orderItemDTO.setpId((int) result[0]);
//            orderItemDTO.setCurrentPrice((int) result[1]);
//            orderItemDTO.setSalediscount((int) result[2]);
//            orderItemDTO.setSalePrice((int) result[3]);
//            orderItems.add(orderItemDTO);
//        }
//
//        return orderItems;
//    }

//    public List<Object[]> getDiscountedPrices() {
//        return discountRepository.findDiscountedPrices();
//    }
}
