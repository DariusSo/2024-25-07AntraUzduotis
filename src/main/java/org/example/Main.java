package org.example;

public class Main {
    public static void main(String[] args) {

        Employee developer = new Developer("Darius", 2500.00, "Java");

        System.out.println(developer.getDetails());
    }
}