package com.mybatis.employeehistory.service;

import com.mybatis.employeehistory.model.EmploymentHistory;

import java.util.List;
import java.util.Optional;

public interface EmploymentHistoryService {

    List<EmploymentHistory> searchByEmp_Id(int id);

}
