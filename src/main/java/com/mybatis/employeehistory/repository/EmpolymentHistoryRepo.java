package com.mybatis.employeehistory.repository;

import com.mybatis.employeehistory.model.EmploymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpolymentHistoryRepo extends JpaRepository<EmploymentHistory, Integer> {
    @Query("select u from EmploymentHistory u where u.emp_id = ?1")
List<EmploymentHistory> findByEmp_Id(int id);


}
