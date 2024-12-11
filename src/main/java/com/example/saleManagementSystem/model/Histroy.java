package com.example.saleManagementSystem.model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
@Table(name = "histroy")
public class Histroy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hid")
    private int hId;

    @Column(name = "salePrice")
    private int salePrice;

    @Column(name = "sDate")
    private Date sDate;

//    private String status;
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = String.valueOf(Status.upcoming);
//    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    @ManyToOne
   @JoinColumn(name = "pid")
   private Product product;

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }



    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

//    @OneToOne(mappedBy = "Histroy")
//    private Product product;
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

}
