package oop.assignment3.ex42.base;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputReader {

    String fileName;

    String textRead;

    public void readInputFromFile() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currLine;

            while((currLine = reader.readLine()) != null)

                textRead += currLine + ",";

            reader.close();

        } catch(Exception ex) {

            return;
        }
    }


    public String returnTextRead() {

        String ret = "";

        for(int i = 0; i < textRead.length() - 1; i++)
            ret += textRead.charAt(i);

        return ret;
    }

}
