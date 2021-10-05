package com.company;

public class Main {

    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();

        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10,20.3);

        System.out.println(square.calculateTheField());
        System.out.println(rectangle.calculateTheField());

    }
}
