package com.example.demo.repo1;

import com.example.demo.model.employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class employeesRepository {

    @Autowired
    JdbcTemplate template;

    /*Getting all Items from table*/
    public List<employees> GetAllEmployees() {
        return template.query("select * from demo.employees", new BeanPropertyRowMapper<employees>(employees.class));

    }

    //Find emp by Id
    public List<employees> GetEmployeesById(int id) {
        return template.query("select emp_no from employees where id=? ", new BeanPropertyRowMapper<employees>(employees.class), id);
    }

    //add Employee
    public int addEmployee(int emp_no, Date birth_date, String first_name, String last_name, String gender, Date hire_date) {
        String query1 = "insert into employees values (?,?,?,?,?,?)";
        return template.update(query1, emp_no, birth_date, first_name, last_name, gender, hire_date);
    }


    //deleteEmployee
    public int deleteEmployee(int id) {
        String query2 = "delete from employees where emp_no=?";
        return template.update(query2, id);
    }
}