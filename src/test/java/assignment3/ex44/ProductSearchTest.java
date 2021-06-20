/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex44;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {
    ProductSearch search = new ProductSearch();

    @Test
    void readFile_inserts_correct_data_into_list_of_Products() throws FileNotFoundException {
        int flag = 0;
        int loopFlag = 0;

        search.readFile();

        List<Product> testList = new ArrayList<>();

        testList.add(new Product("Widget", 25.00, 5));
        testList.add(new Product("Thing", 15.00, 5));
        testList.add(new Product("Doodad", 5.00, 10));

        for (Product p:testList) {
            if(p.compareName("Thing") != 0){
                // should fail no more than twice
                loopFlag++;
            }
        }

        if(loopFlag > 2){
            flag = 1;
        }

        assertEquals(0, flag);
    }
}