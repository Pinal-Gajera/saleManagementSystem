package com.example.saleManagementSystem.Controller;

import com.example.saleManagementSystem.Service.ProductService;
import com.example.saleManagementSystem.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

//    @PostMapping("save")
//    public ResponseEntity<Product> saveAll(@RequestBody Product product){
//        Product saveproduct = productService.saveProduct(product);
//        return ResponseEntity.ok(saveproduct);
//    }

    @PostMapping("save")
    public void save(@RequestBody Product product){
        productService.saveProduct(product);
    }

//    @GetMapping("sort/{field}")
//    private APIResponse<List<Product>> getProductWithSort(@PathVariable String field){
//        List<Product> allProduct = productService.findProductWithSorting(field);
//        return new APIResponse<>(allProduct.size(),allProduct);
//    }

    @GetMapping("/pagination/{offset}/{pageSize}")
    private Page<Product> getProductWithSort(@PathVariable int offset,@PathVariable int pageSize){
        Page<Product> products=productService.findProductPagination(offset, pageSize);
        return  products;
    }
}
