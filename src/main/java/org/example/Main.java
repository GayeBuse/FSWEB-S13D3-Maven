package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Jane", "Due", 18, "Bursa", "opp.gmail.com", "256455445");
        Wall wall = new Wall(5, 4);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is teen: " + person1.isTeen());
        System.out.println("width= " + wall.getWidth());
        wall.setWidth(15);
        System.out.println("height= " + wall.getHeight());
        wall.setHeight(25);
        System.out.println("area= " + wall.getArea());
    }

}