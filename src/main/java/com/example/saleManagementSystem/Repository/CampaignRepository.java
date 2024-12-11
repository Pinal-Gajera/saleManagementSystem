package com.example.saleManagementSystem.Repository;

import com.example.saleManagementSystem.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign,Integer> {
//    @Query(value = "select s_date from campaign where cid=202;",nativeQuery = true)
//    Data getstartdate();

    @Query(value = "select * from campaign where DATE(s_date) = CURDATE()",nativeQuery = true)
    List<Object[]> getAllStartDate();

    @Query(value = "select * from campaign where DATE(e_date) = CURDATE()",nativeQuery = true)
    List<Object[]> getAllEndDate();
}
