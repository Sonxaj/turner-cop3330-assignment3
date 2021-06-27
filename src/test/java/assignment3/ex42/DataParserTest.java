package assignment3.ex42;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

class DataParserTest {
    DataParser dataParser = new DataParser();
    File data = new File("input/exercise42_input.txt");

    @Test
    void readData_creates_and_adds_names_to_list() {
        List<Person> actual = new ArrayList<>();
        int flag = 1; // assume false

        // person to test
        String testLast  = "Ling";
        String testFirst = "Mai";
        int testSal      = 55900;

        Person testPerson = new Person(testLast, testFirst, testSal);

        dataParser.readData(data, actual);

        // if test person is found in the list
        for (Person p:actual) {
            if(dataParser.compareTo(p,testPerson) == 0){
                // set flag
                flag = 0;
                break;
            }
        }

        assertEquals(0, flag);
    }
}