package com.example.saleManagementSystem.model;

import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

import java.sql.Date;
import java.util.List;


////    "discription":"U",
////    "pName":"fan",
////    "currentPrice":800,
////    "inventory":10
////    "discount":[{"salediscount":80}]


//   "title":"JANMASTMI",
//           "sDate":"2024-09-02",
//           "eDate":"2024-09-02",
//
//           "discount":[{"salediscount":20,"product":{"pId":5}}
//           ]


@Entity
@Table(name = "Campaign")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private int cId;
    @Column(name = "title")
    private String title;
    @Column(name = "s_date")
    private Date sDate;
    @Column(name = "e_date")
    private Date eDate;

     @OneToMany(mappedBy = "campaign",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
     private List<Discount> discount;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }

    public List<Discount> getDiscount() {
        return discount;
    }

    public void setDiscount(List<Discount> discount) {
        this.discount = discount;
    }
}
