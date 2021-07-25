package oop.assignment3.ex41.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */
import java.io.*;
import java.util.*;

// define the class solution41
public class solution41
{
    // define inputNames() function to read the data from Scanner object to the ArrayList
    public static void inputNames(Scanner input, ArrayList<String> names)
    {

        while (input.hasNextLine())
        {
            // add the next line to the list of names
            names.add(input.nextLine());
        }
    }

    // define the function to print the names in the file
    public static void outputNames(ArrayList<String> names) throws IOException {

        FileWriter output = new FileWriter("exercise41_output.txt");

        output.write("Total of " + names.size() + " names\n");

        output.write("--------------------\n");

        for (String i : names) {

            output.write(i + "\n");

        }
        // close the output FileWriter
        output.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        // create a scanner object to read from input file
        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));

        // declare an ArrayList for storing the names
        ArrayList<String> names = new ArrayList<String>();

        inputNames(inputFile, names);

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        inputFile.close();

        try {
            outputNames(names);
        }


        // if any exception is raised exit output

        catch (Exception BYE) {
            System.out.println(BYE);
        }
    }
}