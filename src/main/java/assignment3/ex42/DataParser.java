package assignment3.ex42;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DataParser {

    public void readData(File inputFile, List<Person> data){
        /*
            Consider each line as 3 sections: String, String, Int.
            Read up to the "," that separates each data point per
            line. Then parse and create objects. Then store each
            new object into list.
         */
        try {
            Scanner reader = new Scanner(inputFile);

            while(reader.hasNextLine()){

                // split up line into sections
                String[] lineSecs = reader.nextLine().split(",");

                // parse data from line: String last, String first, int salary
                String lName = lineSecs[0];
                String fName = lineSecs[1];
                int sal = Integer.parseInt(lineSecs[2]);

                // create person with parsed data
                Person person = new Person(lName, fName, sal);

                // put into list
                data.add(person);
            }

        }catch (IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    public void printData(List<Person> data){
        System.out.printf("%-10s %-10s %s\n", "First", "Last", "Salary");
        System.out.printf("----------------------------\n");

        for (Person p:data) {
            System.out.printf("%-10s %-10s %d\n", p.getLastName(), p.getFirstName(), p.getSalary());
        }
    }

    public int compareTo(Person person, Person otherPerson){
        // compares last name
        if(!(person.getLastName().equalsIgnoreCase(otherPerson.getLastName()))){
            return 1;

            //  first names
        }else if(!(person.getFirstName().equalsIgnoreCase(otherPerson.getFirstName()))){
            return 1;

            // salary
        }else if(person.getSalary() != otherPerson.getSalary()){
            return 1;

            // they're the same
        }else{
            return 0;
        }
    }

}
