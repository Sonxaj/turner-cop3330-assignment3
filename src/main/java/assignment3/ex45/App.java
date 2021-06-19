/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

/*
Exercise 45 - Word Finder
There will be times when you'll need to read in one file, modify it, and then write a modified version of
that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.

Example Output

Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".

The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".

Constraints

Prompt for the name of the output file.
Write the output to a new file.

Challenges

Modify the program to track the number of replacements and report that to the screen when the program finishes.
Create a configuration file that maps “bad” words to “good” words and use this file instead of a hard-coded value.
Modify the program so it can handle every file a folder of files instead of a single file.
 */

package assignment3.ex45;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        WordFinder finder = new WordFinder();

        String outFile = app.getInput(1);
        finder.setWords(app.getInput(2), 1);
        finder.setWords(app.getInput(3), 2);

        finder.replaceString(outFile);
    }

    private String getInput(int choice) {
        switch (choice){
            default-> System.out.println("Enter name of output file: ");
            case 2 -> System.out.println("Enter word to be replaced: ");
            case 3 -> System.out.println("Enter word to replace with:");
        }

        return in.nextLine();
    }

}
