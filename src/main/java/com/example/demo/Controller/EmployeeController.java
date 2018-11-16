package com.example.demo.Controller;

import com.example.demo.model.employees;
import com.example.demo.repo1.employeesRepository;
import com.example.demo.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Date;

@RestController
public class EmployeeController {

    @Autowired
    employeesRepository repo;

    @Autowired
    com.example.demo.service.employeeService employeeService;
   employees employees;

    @RequestMapping("/getAllEmployee")
    @ResponseBody
    public List<employees> getAllEmployees()
    {
        return repo.GetAllEmployees();
    }

    @RequestMapping("/getEmployee")
    @ResponseBody
    public List<employees> getEmployeeById(@RequestParam("emp_no") int emp_no)
    {
        return repo.GetEmployeesById(emp_no);
    }

//    @RequestMapping(value="/addEmployee" , method = RequestMethod.POST)
//    @ResponseBody
//    public String addEmployee(@RequestParam("emp_no") int emp_no,@RequestParam("birth_date") Date birth_date,
//                           @RequestParam("first_name") String first_name,@RequestParam("last_name") String last_name,
//                           @RequestParam("gender") String gender, @RequestParam("hire_date") Date hire_date)
//    {
//        if (employeeService.addEmployee(emp_no, birth_date,first_name,last_name,gender,hire_date)>=1)
//        {
//            return "added successfully. ";
//        }
//        else
//        {
//            return "something is wrong...";
//        }
//    }



    @RequestMapping(value="/addEmployee" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity addEmployee(@Valid @RequestBody employees employees)
    {
        employeeService.addEmployee(employees.getEmp_no(),employees.getBirth_date(),employees.getFirst_name(),
                employees.getLast_name(),employees.getGender(),employees.getHire_date()) ;

            return  ResponseEntity.ok(HttpStatus.OK);
    }



    @RequestMapping(value= "/deleteEmployee", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteEmployee(@RequestParam("emp_no") int emp_no)
    {
        if (repo.deleteEmployee(emp_no)>=1)
        {
            return "deleted successfully. ";
        }
        else
        {
            return "something is wrong...";
        }
    }

}
