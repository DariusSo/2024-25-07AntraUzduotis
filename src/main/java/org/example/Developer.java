package org.example;

public class Developer extends Employee{
    String name;
    double salary;
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public String getDetails(){
        return "Vardas: " + super.name + " Alga: " + super.salary + " Programming language: " + programmingLanguage;
    };
}
