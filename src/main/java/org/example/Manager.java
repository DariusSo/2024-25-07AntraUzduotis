package org.example;

public class Manager extends Employee{
    String name;
    double salary;
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }


    @Override
    public String getDetails(){
        return "Vardas: " + super.name + " Alga: " + super.salary + " Departamentas: " + department;
    };

}
