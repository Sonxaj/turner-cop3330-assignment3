/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex45;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    WordFinder finder = new WordFinder();

    @Test
    void replaceString_replaces_string_correctly(){

        String search = "utilize";
        int flag = 0;

        finder.setWords("utilize", 1);
        finder.setWords("use", 2);

        finder.replaceString("exercise45_testOutput.txt");

        Scanner scanner = new Scanner("output/exercise45_testOutput.txt");

        // search test file for old string
        while(scanner.hasNextLine()){

            String currentLine = scanner.nextLine();

            if(currentLine.contains(search)){

                // flag if found
                flag = 1;
                break;
            }
        }

        assertEquals(0, flag);
    }
}