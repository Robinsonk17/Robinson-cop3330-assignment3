package oop.assignment3.ex45.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */

// import classes

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class solution45 {

    public static void main(String[] args) throws IOException {
        String output, str;

        // Initialize scanner for user input.
        Scanner input = new Scanner(System.in);

        // Prompt user for the name of the output file.
        System.out.print("Enter the output file : ");
        output = input.next();

        str = "";

        // Re-initialize scanner to read from the file.
        input = new Scanner(new File("exercise45_input.txt"));

        // For each line read, replace the word "utilize" with the word "use".
        while (input.hasNext()) {
           str += input.nextLine().replaceAll("utilize", "use") + "\n";
        }

        // Write the string to a file.
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        writer.write(str);
        writer.close();
    }
}
