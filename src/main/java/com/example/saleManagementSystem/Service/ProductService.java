package com.example.saleManagementSystem.Service;

import com.example.saleManagementSystem.Repository.ProductRepository;
import com.example.saleManagementSystem.model.Discount;
import com.example.saleManagementSystem.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

//    public Product saveProduct(Product product) {
//        return productRepository.save(product);
//    }

    public void saveProduct(Product product) {
//        List<Discount> d1=product.getDiscount();
//        for(Discount discount:d1){
//            discount.setProduct(product);
//        }
//        product.setDiscount(d1);
        productRepository.save(product);
    }

//    public List<Product> findProductWithSorting(String field){
//        return productRepository.findAll(Sort.by(Sort.Direction.ASC,field));
//    }

    public Page<Product> findProductPagination(int offset,int pageSize){
        Page<Product> products=productRepository.findAll(PageRequest.of(offset, pageSize));
        return products;
    }
}
