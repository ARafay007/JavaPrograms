package io.training.inheritance;

public class Employee {
    String name, contact, address, designation;

//    Employee(){}

    Employee(String name, String contact, String address, String designation){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.designation = designation;
    }

    public void showBasicDetail(){
        System.out.print(name + "\n" + contact + "\n" + address + "\n" + designation + "\n");
    }
}
