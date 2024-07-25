package org.example;

public class Developer extends Employee{
    String name;
    double salary;
    String programmingLanguage;

    @Override
    public String getDetails(){
        return "Vardas: " + this.name + " Alga: " + salary + " Programming language: " + programmingLanguage;
    };
}
