package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human human;
        System.out.println("Who are you: ");
        System.out.print("1.Boy or 2.Girl");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if(choice==1){
            human = new Boy();
            human.speak();
        }
        else if(choice==2){
            human = new Girl();
            human.speak();
        }
        else{
            System.out.println("You entered invalid value");
            human = new Human();
            human.speak();
        }

    }
}
