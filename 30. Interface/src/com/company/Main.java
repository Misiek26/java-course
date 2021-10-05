package com.company;

public class Main {

    public static void main(String[] args) {

        //Interface = szablon klasy

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        System.out.println();

        Hawk hawk = new Hawk();
        hawk.hunt();
        System.out.println();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

    }
}
