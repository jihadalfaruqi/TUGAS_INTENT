package com.example.tugasintent;


import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String age;
    private String address;

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

