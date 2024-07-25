package org.example;

public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.name = "Darius";
        developer.salary = 2500.00;
        developer.programmingLanguage = "Java";
        System.out.println(developer.getDetails());
    }
}