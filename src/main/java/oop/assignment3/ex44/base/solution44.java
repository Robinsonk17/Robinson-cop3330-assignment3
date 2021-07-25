package oop.assignment3.ex44.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution44 {
    // This function will read data into a list of products using the appropriate JSONParser and classes.
    public static List<Product> readData(String fileName) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        // Parse the file and save into a JSONObject.
        JSONObject object = (JSONObject) parser.parse(new FileReader(fileName));

        // The "products" field is an array. Retrieve it and cast.
        JSONArray array = (JSONArray) object.get("products");
        List<Product> productList = new ArrayList<>();

        // For each item, retrieve the item as a JSONObject and add it to the list of products.
        for (Object p : array) {
            JSONObject product = (JSONObject) p;
            productList.add(new Product((String) product.get("name"), (double) product.get("price"), ((Long) product.get("quantity")).intValue()));
        }

        // Return.
        return productList;
    }

    // Function that will locate a product by name.
    public static Product findProduct(List<Product> products, String name) {
        Product product = null;

        // For each product, if the names are equivalent, assign to the product.
        for (Product p : products) {
            if (p.getName().equals(name)) {
                product = p;
            }
        }

        // Return product, or null if not found.
        return product;
    }

    public static void main(String[] args) throws IOException, ParseException {
        String name = "";
        Scanner input = new Scanner(System.in);
        Product product;

        // Read in products from json file to the list of products.
        List<Product> products = readData("exercise44_input.json");

        while (true) {
            System.out.print("What is the product name? ");
            name = input.next();

            // Find product by name.
            product = findProduct(products, name);

            if (product == null) {
                System.out.println("Sorry, that product was not found in our inventory.");
            } else {
                break;
            }
        }

        // If here, we know the product was found. Output details.
        System.out.printf("Name: %s\nPrice: %.2f\nQuantity: %d\n", product.getName(), product.getPrice(), product.getQuantity());
    }
}