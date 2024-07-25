package org.example;

public abstract class Employee {
    String name;
    double salary;

    public  String getDetails(){
        return "Vardas: " + this.name + " Alga: " + salary;
    };

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
