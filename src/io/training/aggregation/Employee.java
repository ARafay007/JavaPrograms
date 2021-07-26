package io.training.aggregation;

public class Employee {
    private String empName, contact;
    private Address address;

    public Employee(String empName, String contact, Address address){
        this.empName = empName;
        this.contact = contact;
        this.address = address;
    }

    public String getEmpName(){
        return empName;
    }

    public String getEmpContact(){
        return contact;
    }

    public Address getEmpAddress(){
        return address;
    }
}
