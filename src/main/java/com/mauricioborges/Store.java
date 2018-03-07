package com.mauricioborges;

public class Store {
    public Store(String id, String name) {
        this.id = id;
        this.name = name;
        this.address =new Address("street 1", 123, "one city");

    }

    private String id;
    private String name;
    private Address address;

}
