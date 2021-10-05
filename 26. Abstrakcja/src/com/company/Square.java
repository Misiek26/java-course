package com.company;

public class Square extends Shape{
    private double length;

    Square(int length){
        this.length = length;
    }

    @Override
    double calculateTheField() {
        return Math.pow(this.length,2);
    }
}
