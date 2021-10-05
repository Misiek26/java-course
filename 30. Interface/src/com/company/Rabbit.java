package com.company;

public class Rabbit implements Prey{ // Do klasy dołączamy interface Pray
    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing");
    }
}
