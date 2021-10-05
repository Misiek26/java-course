package com.company;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter side a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter side b: "));
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        JOptionPane.showMessageDialog(null, "The hypotenuse is: "+c);
    }
}
