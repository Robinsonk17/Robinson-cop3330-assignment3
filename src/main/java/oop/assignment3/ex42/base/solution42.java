package oop.assignment3.ex42.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */
public class solution42
{

        public static void main(String[] args) {


            String inputNotParsed;
            inputNotParsed = readInto("src/main/java/ex42/exercise42_input.txt");

            String[] parsedData;
            parsedData = parseInput(inputNotParsed);

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

        public static String readInto(String fileName) {

            String input;

            InputReader reader = new InputReader();
            reader.fileName  = fileName;
            reader.textRead = "";

            reader.readInputFromFile();
            input = reader.returnTextRead();

            return input;

        }

        public static String[] parseInput(String input) {

            String[] ret;

            ParserInput p = new ParserInput();
            p.inputNotParsed = input;

            ret = p.returnParsedInput();

            return ret;


        }
    }
