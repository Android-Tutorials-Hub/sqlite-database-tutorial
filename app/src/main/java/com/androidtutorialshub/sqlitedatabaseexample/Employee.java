package com.androidtutorialshub.sqlitedatabaseexample;

/**
 * Created by AndroidTutorialsHub on 1/24/2016.
 */
public class Employee {

    private int empId;
    private String empName;
    private String empPhoneNo;

    public Employee() {

    }

    public Employee(String empName, String empPhoneNo) {
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }
}
