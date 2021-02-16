package com.mybatis.employeehistory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EmploymentHistory {
    @Id
    private int id;
    private int emp_id;
    private String Organization_name;
    private Date from_date;
    private Date until_date;
    private String location;
    private String country;
    private String post;
    private String skill_used;
}
