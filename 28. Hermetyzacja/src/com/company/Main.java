package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Chevrolet","Camaro", 2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2020);
        System.out.println(car.getYear());

    }
}
