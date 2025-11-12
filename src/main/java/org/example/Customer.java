package org.example;

public class Customer extends Entita {
    private double money;


    public Customer(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public void ahoj(){
        System.out.println("Ahoj");
    }
}
