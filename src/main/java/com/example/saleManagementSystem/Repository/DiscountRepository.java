package com.example.saleManagementSystem.Repository;

import com.example.saleManagementSystem.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,Integer> {
//    @Query("SELECT oi.pid, p.currentPrice, oi.SaleDiscount, (p.currentPrice - (p.currentPrice * oi.SaleDiscount / 100)) AS salePrice " +
//            "FROM Discount oi JOIN oi.product p")
//    List<Object[]> findOrderItemsWithDiscountedPrice();
//@Query(value = "SELECT c.pid, p.currentPrice * (1 - c.SaleDiscount / 100) AS salePrice " +
//        "FROM Discount c JOIN c.product p",nativeQuery = true)
//    List<Object[]> findDiscountedPrices();

   @Query(value = " select sale_discount from discount where cid=202",nativeQuery = true)
    int findDiscount();
}
