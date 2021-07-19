package io.training.inheritance;

public class Peon extends Employee{
    //    String name, contact, address, dept, designation;
//    String dept;

    public Peon (String name, String contact, String address, String designation){
        super(name, contact, address, designation);
//        this.dept = dept;
    }

    public void showPeonDetails(){
        super.showBasicDetail();
        System.out.println("\n");
    }
}
