/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex46;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class wordFrequencyFinder {

    // hashmap for storing wordFs
    HashMap<String, wordF> words = new HashMap<>();

    // reading from file
    File input = new File("input/exercise46_input.txt");

    public void readWords() {
        try {
            Scanner reader = new Scanner(input);

            while (reader.hasNextLine()) {
                String[] lineSecs = reader.nextLine().split(" ");

                // check if word is found in hashmap
                for (String w : lineSecs) {

                    // if no, create wordF object with that word, add to map
                    if(!(words.containsKey(w))) {
                        wordF current = new wordF(w);
                        words.put(w, current);

                    // if yes, go to wordF object in map, increment count
                    }else {
                        words.get(w).incrementFreq();
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }


    // printing results
    public void printResults() {

        // copy all values into list
        List<wordF> wordsToSort = new ArrayList<>(words.values());

        // sort it
        Collections.sort(wordsToSort);
        Collections.reverse(wordsToSort);

        // print
        for (wordF w:wordsToSort) {
            System.out.printf("%-12s %-12s\n", w.getContent() + ":", w.printStars());
        }

    }
}
