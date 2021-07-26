package io.training.aggregation;

public class Students{
    private String name;
    private Address address;

    public Students(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getStdName(){
        return name;
    }

    public Address getStdAdress(){
        return address;
    }
}