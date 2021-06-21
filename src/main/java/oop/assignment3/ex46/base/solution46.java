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

        public static void main(String[] args) throws IOException

        {

            File f1=new File("input.txt");
            //Create Descriptor for input file

            String[] words=null;

            FileReader fr = new FileReader(f1);

            BufferedReader br = new BufferedReader(fr);

            String s;

            String input="Java"; // Input word to be searched

            int count=0; //Initialize the word to zero

            while((s=br.readLine())!=null)

            {

                words=s.split(" "); //Split the word using space

                for (String word : words)

                {

                    if (word.equals(input))
                        //Search for the given word

                    {

                        count++;
                        //If Present increase the count by one

                    }

                }

            }

            if(count!=0)
                //Check for count not equal to zero

            {

                System.out.println("The given word is present for "+count+ " Times in the file");

            }

            else

            {

                System.out.println("The given word is not present in the file");

            }

            fr.close();

        }

    }
