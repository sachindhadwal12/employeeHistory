package com.mybatis.employeehistory.controller;

import com.mybatis.employeehistory.model.EmploymentHistory;
import com.mybatis.employeehistory.service.EmploymentHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("api/v1")
public class EmploymentHistoryController {

    @Autowired
    EmploymentHistoryService service;
//    this method will fetch all data from employment_history table
    @GetMapping("employeehistory")
    public List<EmploymentHistory> getAllEmployeeHistory(){
        return  service.getAllEmployeeHistory();
    }
// this method will fetch the details of employee based on Id
    @GetMapping("employeehistory/{id}")
    public List<EmploymentHistory> getEmployeeHistoryById(@PathVariable int id){
        return  service.searchByEmp_Id(id);
    }




}
