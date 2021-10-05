package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("rat");
        animals2.add("bird");

        for(String i : animals){
            System.out.println(i);
        }
        for(String x : animals2){
            System.out.println(x);
        }
        double x = 2.54534354;
        x = Math.round(x*100);
        x/=100;
        System.out.println(x);
    }
}
