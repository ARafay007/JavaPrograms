package io.training.inheritance;

public class Manager extends Employee{
//    String name, contact, address, dept, designation;
    String dept;

    public Manager (String name, String contact, String address, String dept, String designation){
        super(name, contact, address, designation);
        this.dept = dept;
    }

    public void showHRDetails(){
        super.showBasicDetail();
        System.out.println(dept + "\n");
    }
}
