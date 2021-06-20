package assignment3.ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NameSorter {


    // Read from file and add to list
    public void readNames(File inputFile, List<String> names){

        // Read names from file
        try {
            Scanner reader = new Scanner(inputFile);

            // add all to list
            while(reader.hasNextLine()){
                names.add(reader.nextLine());
            }

            reader.close();

        // catch any exceptions
        }catch (IOException e){
            System.out.println("An Error has Occurred.");
            e.printStackTrace();
        }
    }

    // Sort list
    public void sortNames(List<String> names){

        // Use Collections.sort(names)
        Collections.sort(names);
    }


    // Print list to file
    public void printList(List<String> names){
        try{
            // create new output file
            FileWriter outputFile = new FileWriter("output/exercise41_output.txt");

            outputFile.write("Total of " + names.size() + " names\n");
            outputFile.write("-----------------\n");

            // write names in list
            for (String i:names) {
                outputFile.write(i + "\n");
            }

            outputFile.close();

        // catch any exceptions
        }catch (IOException e){
            System.out.println("An Error has Occurred.");
            e.printStackTrace();
        }
    }
}
