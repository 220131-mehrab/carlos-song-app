package com.github.KarlitosTaquitos.songapp;

import java.io.*;

public class SongList {
    Song[] songs = new Song[14000];

    public SongList(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader buffReader = new BufferedReader(fileReader);
            buffReader.readLine();
            String line = buffReader.readLine();

            int i = 0;
            while (line != null) {
                String[] columns = line.split("\t");

                Song newSong = new Song();
                newSong.setSongName(columns[1]);
                newSong.setArtistName(columns[3]);
                songs[i] = newSong;

                i++;
                line = buffReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found chief");
        }
        /*
        Old way of reading file didn't read the whole thing

        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");

            int i = 0;
            while (scanner.hasNext()) {
                songs[i] = scanner.next();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Scanner could not find file");
        }*/
    }
}
