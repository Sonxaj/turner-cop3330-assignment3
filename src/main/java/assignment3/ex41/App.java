package assignment3.ex41;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class App {

    public static void main(String[] args) {

        NameSorter nameSorter = new NameSorter();

        File inputFile = new File("src/main/java/assignment3/ex41/exercise41_input.txt");
        List<String> names = new ArrayList<>();

        nameSorter.readNames(inputFile, names);

        nameSorter.sortNames(names);

        nameSorter.printList(names);
    }
}
