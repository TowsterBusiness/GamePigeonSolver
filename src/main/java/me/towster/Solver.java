package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solver {

    // Not used but should be formatted like this
    char[][] wordHuntTest = {
            {'o', 'o', 'h', 'i'},
            {'l', 'p', 'd', 'm'},
            {'r', 'f', 'n', 'c'},
            {'e', 'e', 'c', 'r'}
    };
    public static List<List<int[]>> solve(char[][] wordHunt) {
        //oohilpdmrfnceecr - Word Hunt Test

        List<String> wordList = new ArrayList<String>();
        try {
            File myObj = new File("./src/main/resources/words.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                wordList.add(data.toLowerCase());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        LetterNode head = new LetterNode('#');
        for (String word : wordList) {
            if (word.length() < 3) continue;
            head.addWord(word);
        }

        List<List<int[]>> goodLocs = new ArrayList<>();

        for (int starterX = 0; starterX < 4; starterX++) {
            for (int starterY = 0; starterY < 4; starterY++) {
                int pointerX = starterX, pointerY = starterY;
                int tempPX = 0, tempPY = 0;


                List<Integer> directionsWent = new ArrayList<>();
                // 0 - right, clockwise

                List<Character> wentPlaces = new ArrayList<>();
                wentPlaces.add(wordHunt[starterY][starterX]);

                List<int[]> wentLoc = new ArrayList<>();
                wentLoc.add(new int[]{starterX, starterY});
                int dirChecked = -1;
    }




}