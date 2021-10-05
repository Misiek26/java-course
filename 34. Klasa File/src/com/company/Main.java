package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("secret_message.txt"); // Jeśli nie znajduje się w folderze z projektem, trzeba podać dokładną ścieżkę do pliku

        if(file.exists()){
            System.out.println("That file exists! :O");
            System.out.println(file.getPath());//Podaje nazwe pliku
            System.out.println(file.getAbsolutePath()); // Podaje lokalizację dokładną
            System.out.println(file.isFile()); // Zwraca true jeśli jest plikiem
            file.delete(); // Usuwa plik
        }
        else{
            System.out.println("That file doesn't exists! :(");
        }
    }
}
