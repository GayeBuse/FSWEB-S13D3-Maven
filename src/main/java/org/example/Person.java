package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String address;
    String email;
    String number;


    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String address, String email, String number) {
        this(firstname, lastName, age);
        this.address = address;
        this.email = email;
        this.number = number;
    }


    public String getFirstName() {

        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

}
