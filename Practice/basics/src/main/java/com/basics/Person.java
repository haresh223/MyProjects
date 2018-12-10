package com.basics;

//POJO : Plain Old Java Object

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personDetails() {
        System.out.println("FirstName: "+ getFirstName());
        System.out.println("LastName: "+ getLastName());
        System.out.println("Age: "+ getAge());
    }


    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // default constructor
    public Person() {
    }
}

