package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.toString());
        //Jeśli zdefiniujemy metodę toString dla klasy
        // to możemy wypisywać obiekt po nazwie tak jak poniżej
        System.out.println(car);
    }
}
