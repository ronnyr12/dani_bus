package com.example.myapplication;

public class Person {
    private String name;
    private int id;
    private String phoneNumber;



    public Person(String name, int id,String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void Teacher (String name, String phoneNumber, String id){
        int type = 1;
    }
    public void Student (String name, String phoneNumber, String name_of_teacher){

    }


}
