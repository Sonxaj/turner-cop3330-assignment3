/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex44;

import com.google.gson.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductSearch {
    Scanner in = new Scanner(System.in);
    List<Product> inventory = new ArrayList<>();

    public void readFile()throws FileNotFoundException {

        File input = new File("input/exercise43_input.json");

        // get JSON object from file
        JsonObject inputJson = JsonParser.parseReader(new FileReader(input)).getAsJsonObject();

        // process all products as array
        JsonArray jsonArrayOfProducts = inputJson.get("products").getAsJsonArray();

        // for each element in array
        for (JsonElement productElement:jsonArrayOfProducts) {

            // get the JsonObject
            JsonObject productJsonObj = productElement.getAsJsonObject();

            // extract data
            String name = productJsonObj.get("name").getAsString();
            double price = productJsonObj.get("price").getAsDouble();
            int quantity = productJsonObj.get("quantity").getAsInt();

            // create object
            Product product = new Product(name, price, quantity);

            // insert into list
            inventory.add(product);
        }
    }


    public void checkInv(){
        // boolean for checking, int for found index
        boolean isFound = false;
        int indexFound = 0;

        while(!isFound) {
            // prompt for input
            System.out.println("What is the product name?\n");
            String itemCheck = in.nextLine();

            // for each product
            for (Product p : inventory) {

                // if item to check is found, set flag and store index found; else prompt again
                if (p.compareName(itemCheck) == 0) {
                    isFound = true;
                    indexFound = inventory.indexOf(p);
                }
            }

            // print if product was found; else prompt for input again
            if(isFound){
                System.out.println(inventory.get(indexFound).toString());
            }else{
                System.out.println("\nSorry, that product was not found in our inventory.\n");
            }
        }
    }

}
