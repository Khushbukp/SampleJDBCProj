package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class employees {

    private int emp_no;
    private Date birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private Date hire_date;
   // private Date createdDate = new Date();



//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
//    private Date createdDate ;

    public employees() {
    }

    public employees(int emp_no, Date birth_date, String first_name, String last_name, String gender, Date hire_date) {
        this.emp_no = emp_no;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hire_date = hire_date;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" , locale = "en_GB")
    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "en_GB")
    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }


    @Override
    public String toString() {
        return "employees{" +
                "emp_no=" + emp_no +
                ", birth_date=" + birth_date +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", hire_date=" + hire_date +
                '}';
    }
}
