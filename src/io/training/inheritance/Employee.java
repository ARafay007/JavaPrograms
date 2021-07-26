package io.training.inheritance;

public class Employee {
    private String name, contact, address, designation;

    Employee(String name, String contact, String address, String designation){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.designation = designation;
    }

    protected void showBasicDetail(){
        System.out.print(name + "\n" + contact + "\n" + address + "\n" + designation + "\n");
    }
}
