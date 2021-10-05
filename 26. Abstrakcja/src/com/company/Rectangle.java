package com.company;

public class Rectangle extends Shape{
    private double width, height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateTheField() {
        return this.width * this.height;
    }
}
