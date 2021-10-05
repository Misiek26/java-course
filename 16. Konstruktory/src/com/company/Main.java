package com.company;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Rick", 65,89.20);
        Human human2 = new Human("Morty",16,50.98);

        human2.eat();
        human1.drink();
    }
}
