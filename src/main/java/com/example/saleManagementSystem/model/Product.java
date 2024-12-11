package com.example.saleManagementSystem.model;

import jakarta.persistence.*;

import java.util.List;

//{
//        "discription":"T",
//        "pName":"HGF",
//        "mrp":9000,
//        "currentPrice":5600,
//        "inventory":10,
//        "discount":[{"salediscount":20}]
//}



@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pId;

    @Column(name = "Description")
    private String discription;

    @Column(name = "pname")
    private String pName;

    @Column(name = "mrp")
    private int mrp;

    @Column(name = "currentPrice")
    private int currentPrice;

    @Column(name = "InventoryCount")
    private int inventory;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    List<Discount> discount;

    public List<Discount> getDiscount() {
        return discount;
    }

    public void setDiscount(List<Discount> discount) {
        this.discount = discount;
    }

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    List<Histroy> histroy;

    public List<Histroy> getHistroy() {
        return histroy;
    }

    public void setHistroy(List<Histroy> histroy) {
        this.histroy = histroy;
    }





    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getDescrip() {
        return discription;
    }

    public void setDescrip(String descrip) {
        this.discription = descrip;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }



    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

}
