package io.training.aggregation;

public class Address {
    private int streetNum;
    private String city, country;

    public Address(int streetNum, String city, String country){
        this.streetNum = streetNum;
        this. city = city;
        this.country = country;
    }

    public int getStreetNum(){
        return streetNum;
    }

    public String getcity(){
        return city;
    }

    public String getCountery(){
        return country;
    }
}