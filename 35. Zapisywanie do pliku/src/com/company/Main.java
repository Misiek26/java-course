package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
             FileWriter writer = new FileWriter("poem.txt");
             writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere"); // zapisywanie od zera tekstu w pliku
             writer.append("\n(A poem by Michał)"); // dodawanie tekstu
             writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
