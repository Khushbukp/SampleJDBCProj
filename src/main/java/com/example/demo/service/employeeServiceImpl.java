package com.example.demo.service;

import com.example.demo.repo1.employeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("employeeService")
public class employeeServiceImpl implements employeeService{

    @Autowired
    com.example.demo.repo1.employeesRepository employeesRepository;

    @Override
    public int addEmployee(int emp_no, Date birth_date, String first_name, String last_name, String gender, Date hire_date) {
        return employeesRepository.addEmployee(emp_no,birth_date,first_name,last_name,gender, hire_date);
    }


}
