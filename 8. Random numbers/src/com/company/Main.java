package com.company;

import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1; //Generate the number from 1-6
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        JOptionPane.showMessageDialog(null,"The random number from 1-6: " + x);
        JOptionPane.showMessageDialog(null, "The random double number: "+y);
        JOptionPane.showMessageDialog(null, "The random boolean: "+z);
    }
}
