package io.training.inheritance;

public class Teacher extends Employee{
//    String name, contact, address, dept, designation;
    String dept;

    public Teacher(String name, String contact, String address, String dept, String designation){
        super(name, contact, address, designation);
        this.dept = dept;
    }

    public void showTeacherDetail(){
        super.showBasicDetail();
        System.out.println(dept + "\n");
    }
}
