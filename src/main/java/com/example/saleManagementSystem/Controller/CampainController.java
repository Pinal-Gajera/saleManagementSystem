package com.example.saleManagementSystem.Controller;

import com.example.saleManagementSystem.Repository.CampaignRepository;
import com.example.saleManagementSystem.Service.CampaignService;
import com.example.saleManagementSystem.model.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("campaign")
public class CampainController {
    @Autowired
    CampaignService campaignService;

    @Autowired
    CampaignRepository campaignRepository;

    @PostMapping("save")
    public void saveAll(@RequestBody Campaign campaign){
        campaignService.saveAll(campaign);
    }

//    @GetMapping("get")
//    public Campaign get(){
//        return campaignRepository.findById(202).get();
//    }


























//    @PostMapping("/update-sale-prices")
//    public ResponseEntity<Void> updateSalePrices() {
//        productService.updateSalePrices();
//        return ResponseEntity.ok().build();
//    }

//    @PostMapping("update-sale-prices")
//    public void SalePrices(){
//        campaignService.updateSalePrices();
//    }
}
