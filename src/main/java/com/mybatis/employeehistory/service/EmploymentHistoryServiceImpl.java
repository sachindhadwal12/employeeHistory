package com.mybatis.employeehistory.service;

import com.mybatis.employeehistory.model.EmploymentHistory;
import com.mybatis.employeehistory.repository.EmpolymentHistoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmploymentHistoryServiceImpl implements EmploymentHistoryService{
   @Autowired
    EmpolymentHistoryRepo historyRepo;
    @Override
    public List<EmploymentHistory> getAllEmployeeHistory() {
        return historyRepo.findAll();
    }

    @Override
    public List<EmploymentHistory> searchByEmp_Id(int id) {
        return historyRepo.findByEmp_Id(id);
    }


}
