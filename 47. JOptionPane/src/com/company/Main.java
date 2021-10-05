package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Here is more useless info :D","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Really?","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"You're computer has a VIRUS!","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Call tech support NOW OR ELSE!","title",JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null,"Michał, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("What is your name?: ");

        String[] responses = {"No, you're awesome!", "Thank you!", "*blush*"};

        JOptionPane.showOptionDialog(
                null,
                "You are awesome!",
                "secret message",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.INFORMATION_MESSAGE,
                null,
                 responses, // Dodajemy opcje do wyboru z tablicy responses
                0);
    }
}
