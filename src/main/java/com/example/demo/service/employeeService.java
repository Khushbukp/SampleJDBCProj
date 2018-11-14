package com.example.demo.service;

import java.util.Date;

public interface employeeService {

    public int addEmployee(int emp_no, Date birth_date, String first_name, String last_name, String gender, Date hire_date);
}
