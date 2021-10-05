package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        //Food[] refrigerator = {food1, food2, food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        //System.out.println(refrigerator[0].name);
        //System.out.println(refrigerator[1].name);
        //System.out.println(refrigerator[2].name);

        ArrayList<Food> refrigerator = new ArrayList<>();

        refrigerator.add(food1);
        refrigerator.add(food2);
        refrigerator.add(food3);

        for(Food x : refrigerator){
            System.out.println(x);
        }
    }
}
