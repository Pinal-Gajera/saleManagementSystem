package com.example.saleManagementSystem.Service;

import com.example.saleManagementSystem.Repository.CampaignRepository;
import com.example.saleManagementSystem.Repository.DiscountRepository;
import com.example.saleManagementSystem.Repository.ProductRepository;
import com.example.saleManagementSystem.model.Campaign;
import com.example.saleManagementSystem.model.Discount;
import com.example.saleManagementSystem.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignService {
    @Autowired
    CampaignRepository campaighRepository;

    @Autowired
    DiscountRepository discountRepository;

    @Autowired
    ProductRepository productRepository;

    public void saveAll(Campaign campaign) {
        List<Discount> c=campaign.getDiscount();
        for (Discount d:c){
            d.setCampaign(campaign);
        }
        campaign.setDiscount(c);
        campaighRepository.save(campaign);
    }


//    public void updateSalePrices() {
//        List<Discount> products = productRepository.findAll();
//
//        for (Discount d1 : products){
//
//        }
//    }


//    @Transactional
//    public void updateSalePrices() {
//        List<Product> products = productRepository.findAll();
//
//        for (Product product : products) {
//            Price price = priceRepository.findByProduct(product);
//            Discount discount = discountRepository.findByProduct(product);
//
//            if (price != null && discount != null) {
//                double salePrice = price.getCurrentPrice() - (price.getCurrentPrice() * discount.getDiscountPercentage() / 100);
//                price.setSalePrice(salePrice);
//                priceRepository.save(price);
//            }
//        }
//    }
//}
}
