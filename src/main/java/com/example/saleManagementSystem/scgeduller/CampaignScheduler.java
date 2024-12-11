package com.example.saleManagementSystem.scgeduller;

import com.example.saleManagementSystem.Repository.*;
import com.example.saleManagementSystem.Repository.CampaignRepository;
import com.example.saleManagementSystem.model.Campaign;
import com.example.saleManagementSystem.model.Discount;
import com.example.saleManagementSystem.model.Histroy;
import com.example.saleManagementSystem.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@EnableScheduling
@Configuration
@Component
public class CampaignScheduler {

    @Autowired
    CampaignRepository campaignRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DiscountRepository discountRepository;

    @Autowired
    HistoryRepository historyRepository;
//    @Scheduled(cron = "* * * * * *")
//    private void print(){
//        Date currentdate = new Date(System.currentTimeMillis());
//        List<Campaign> campaigns = campaignRepository.findAll();
//
//        for(Campaign i : campaigns){
//            System.out.println(campaigns.toString());
//            if(i.getsDate().compareTo(currentdate)==0){
//                System.out.println(campaigns.toString());
//            }
//        }

//    @Scheduled(cron = "0 * * * * *")
    public void startDate() {
        System.out.println("method started");
        List<Object[]> sDate = campaignRepository.getAllStartDate();
//        List<Campaign> campaigns=campaignRepository.findAll();

        for (Object[] ob : sDate) {
            Campaign campaign = campaignRepository.findById((int) ob[0]).get();
            for (Discount discount : campaign.getDiscount()) {
                int salediscount = discount.getSalediscount();
                Product product = productRepository.findById(discount.getProduct().getpId()).get();

                int currentPrice = product.getCurrentPrice();

                int saleprice = currentPrice - ((product.getMrp() * salediscount) / 100);
                product.setCurrentPrice(saleprice);
                productRepository.save(product);

                Histroy histroy = new Histroy();
                histroy.setSalePrice(currentPrice);
                histroy.setsDate(campaign.getsDate());
                histroy.setProduct(product);
                historyRepository.save(histroy);

            }

        }
    }

    @Scheduled(cron = "0 * * * * *")
    public void end(){
        System.out.println("method started");
        List<Object[]> sDate = campaignRepository.getAllStartDate();
//        List<Campaign> campaigns=campaignRepository.findAll();

        for (Object[] ob : sDate) {
            Campaign campaign = campaignRepository.findById((int) ob[0]).get();
            for (Discount discount : campaign.getDiscount()) {
                int salediscount = discount.getSalediscount();
                Product product = productRepository.findById(discount.getProduct().getpId()).get();

                int currentPrice = product.getCurrentPrice();

                int saleprice = currentPrice + ((product.getMrp() * salediscount) / 100);
                product.setCurrentPrice(saleprice);
                productRepository.save(product);

                Histroy histroy = new Histroy();
                histroy.setSalePrice(currentPrice);
                histroy.setsDate(campaign.getsDate());
                histroy.setProduct(product);
                historyRepository.save(histroy);

            }

        }
    }

    public void endDate(){

//        System.out.println("method called");
//
//        List<Object[]> eDate=campaignRepository.getAllEndDate();
//        for(Object[] ob:eDate){
//
//            System.out.println("method called1");
//
//            Campaign campaign=campaignRepository.findById((int)ob[0]).get();
//
//    for (Discount d:campaign.getDiscount()){
//
//        System.out.println("method called3");
//
//        Product product = productRepository.findById(d.getProduct().getpId()).get();
//
//        Histroy histroy=historyRepository.oldHistory(campaign.getsDate(),d.getProduct().getpId());
//
////        System.out.println(histroy.getSalePrice());
//
//        Histroy newHistory = new Histroy();
//        newHistory.setsDate(campaign.geteDate());
//        newHistory.setSalePrice(product.getCurrentPrice());
//        newHistory.setProduct(product);
//
//
//        product.setCurrentPrice(histroy.getSalePrice());
//
//             System.out.println("method called3");
//
//                productRepository.save(product);
//                historyRepository.save(newHistory);
//            }
//        }
    }
}