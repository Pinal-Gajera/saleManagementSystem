package com.example.saleManagementSystem.Repository;

import com.example.saleManagementSystem.model.Histroy;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<Histroy, Integer> {
    @Query(value = "select * from histroy where s_date=?1 and pid=?2",nativeQuery = true)
    Histroy oldHistory(@Param("s_date") Date s_date,@Param("pid") int pId);
}
