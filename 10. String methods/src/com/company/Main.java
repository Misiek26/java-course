package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String name = "Michał";

        boolean result = name.equals("michał"); //Porównuje dokładnie dwa łańcuchy znaków
        boolean result2 = name.equalsIgnoreCase("michał"); //Porównuje dwa łańcuchy znaków bez podziału na wielkość znaków
        int result3 = name.length();
        char result4 = name.charAt(0);
        int result5 = name.indexOf("a");
        boolean result6 = name.isEmpty();//Sprawdza czy zmienna zawiera jakieś znaki
        String result7 = name.toUpperCase();
        String result8 = name.toLowerCase();
        String result9 = name.trim();//Powiększa tylko pierwszą litere
        String result10 = name.replace("i","o");//Zamienia znaki ze sobą

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);
    }
}
