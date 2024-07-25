package org.example;

public class Manager extends Employee{
    String name;
    double salary;
    String department;

    @Override
    public String getDetails(){
        return "Vardas: " + this.name + " Alga: " + salary + " Departamentas: " + department;
    };
}
