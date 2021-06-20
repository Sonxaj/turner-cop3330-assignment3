/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex45;

import java.io.*;

public class WordFinder {

    private String oldWord, newWord;

    File inputFile = new File("input/exercise45_input.txt");


    // opens file, searches, replaces, then rewrites to file
    public void replaceString(String outputName){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter("output/" + outputName + ".txt");

            String text = "";
            String currentLine = reader.readLine();

            // copy every line from string into String object
            while(currentLine != null){
                text += currentLine + System.lineSeparator();
                currentLine = reader.readLine();
            }

            // replace every instance of old with new
            writer.write(text.replaceAll(oldWord, newWord));

            reader.close();
            writer.close();

        }catch (IOException e){
            System.out.println("Error. Could not read or write file.");
            e.printStackTrace();
        }

    }

    public void setWords(String input, int choice){
        // set old and new word
        switch (choice){
            default-> oldWord = input;
            case 2 -> newWord = input;
        }
    }

}
