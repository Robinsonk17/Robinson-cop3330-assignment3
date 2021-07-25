package oop.assignment3.ex42.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */
public class solution42 {
        public static void main(String[] args) throws FileNotFoundException {
            // Parse input from the file.
            String[] parsedData = parseInput("exercise42_input.txt");

            // Format data as specified in the problem.
            System.out.println("Last      First     Salary");
            System.out.println("--------------------------");
            System.out.println(parsedData[0] + "      " + parsedData[1] + "       " + parsedData[2]);
            System.out.println(parsedData[3] + "   " + parsedData[4] + "       " + parsedData[5]);
            System.out.println(parsedData[6] + "     " + parsedData[7] + "     " + parsedData[8]);
            System.out.println(parsedData[9] + "     " + parsedData[10] + "     " + parsedData[11]);
            System.out.println(parsedData[12] + "     " + parsedData[13] + "  " + parsedData[14]);
            System.out.println(parsedData[15] + "     " + parsedData[16] + "      " + parsedData[17]);
            System.out.println(parsedData[18] + "  " + parsedData[19] + "   " + parsedData[20]);
        }

        // This function is responsible for reading data from the file.
        public static String[] parseInput(String fileName) throws FileNotFoundException {
            Scanner input = new Scanner(new File(fileName));
            String data = "";

            // For each line, concatenate onto the data string.
            while (input.hasNextLine()) {
                // Add a comma at the end to aid the algorithm in splitting the string.
                data += input.nextLine() + ",";
            }

            // Split the data by the comma.
            return data.split(",");
        }
    }
