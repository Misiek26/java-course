package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<File> sounds = new ArrayList<>();

        File file1 = new File("music/1.Szpaku - Alicja prod. Kubi Producent.wav");
        File file2 = new File("music/2.Szpaku - W Krainie Czarów prod. PSR (Official Audio) (online-audio-converter.com).wav");
        File file3 = new File("music/3.Szpaku - UFO prod. Michał Graczyk (OFFICIAL VIDEO).wav");
        File file4 = new File("music/4.Szpaku feat. Paluch - SZLAM (Official Video).wav");
        File file5 = new File("music/5.Szpaku - Lavender Town ft. Białas prod. Deckster (Official Audio).wav");
        File file6 = new File("music/6.Szpaku - Zombie prod. D3W (Official Audio).wav");
        File file7 = new File("music/7.Szpaku - Hinata prod. Deemz.wav");
        File file8 = new File("music/8.Szpaku - Nieważne prod. Got Barss (Official Audio).wav");
        File file9 = new File("music/9.Szpaku - Oddajemy krew Wampirom ft. Wlodi prod. Megot(Official Audio).wav");
        File file10 = new File("music/10.Szpaku - Ja YETI prod. Michał Graczyk Rutkovsky(Official Audio).wav");
        File file11 = new File("music/11.Szpaku - MOJO JOJO prod. Kubi Producent (Official Video).wav");


        sounds.add(file1);
        sounds.add(file2);
        sounds.add(file3);
        sounds.add(file4);
        sounds.add(file5);
        sounds.add(file6);
        sounds.add(file7);
        sounds.add(file8);
        sounds.add(file9);
        sounds.add(file10);
        sounds.add(file11);

        int nr=0;
        boolean active = false;
        String response = "";

        System.out.println("Enter your choice: \nP) - Play \nN) - Next Track \nB) - Previous Track \nR) - Replay Track \nQ) - Quit ");
        while(!response.equals("Q")){

            response = scanner.next();
            response = response.toUpperCase();

            switch(response){
                case ("P") : if(active==false){changeTrack(sounds.get(nr)); active=true;} break;
                case ("N") : nr++; if(nr!=11 && active==true){close(Track);changeTrack(sounds.get(nr));} else nr--; break;
                case ("B") : nr--; if(nr!=-1 && active == true){close(Track); changeTrack(sounds.get(nr));} else nr++; break;
                case ("R") : replay(Track); break;
                case ("Q") : System.out.println("Koniec!");break;
                default : System.out.println("Enter your choice: \nP) - Play \nN) - Next Track \nB) - Previous Track \nR) - Replay Track \nQ) - Quit ");
            }
        }
    }
    static Clip Track;

    static void changeTrack(File x) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        AudioInputStream streamAudio = AudioSystem.getAudioInputStream(x);
        Clip clip = AudioSystem.getClip();
        Track = clip;
        clip.open(streamAudio);
        clip.start();
    }
    static void close(Clip x){
        x.close();
    }
    static void replay(Clip x){
        x.setMicrosecondPosition(0);
    }
}
