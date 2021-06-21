package oop.assignment3.ex42.base;

public class ParserInput {

    String inputNotParsed;


    public String[] returnParsedInput() {

        int numberOfSplits = 0;
        for(int i = 0; i < inputNotParsed.length(); i++)
            if(inputNotParsed.charAt(i) == ',')
                numberOfSplits++;


        return inputNotParsed.split(",", numberOfSplits + 1);

    }



}
