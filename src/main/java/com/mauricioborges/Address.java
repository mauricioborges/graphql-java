package com.mauricioborges;

public class Address {
    private String street;
    private Integer number;
    private String city;

    public Address(String street, Integer number, String city) {
        this.street = street;
        this.city = city;
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + street + ',' + number + ' ' + city;
    }
}
