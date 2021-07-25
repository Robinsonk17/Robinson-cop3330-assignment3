package oop.assignment3.ex46.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class solution46 {

        public static void main(String[] args) throws IOException {
            // Initialize the class, read the data, and print.
            WordCount words = new WordCount();
            words.readData("exercise46_input.txt");
            words.printData();
        }
}
