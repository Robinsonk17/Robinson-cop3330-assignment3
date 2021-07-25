package oop.assignment3.ex46.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// This class represents a word counter.
public class WordCount {
    private Map<String, Integer> words;

    public WordCount() {
        words = new LinkedHashMap<>();
    }

    // Function takes in the file and reads in the data into the map of words.
    public void readData(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));

        // For each word, add it to the map that maps the key (name) to the value (number count).
        while (input.hasNext()) {
            String key = input.next();

            // Handles the case where the word has not been added yet.
            Integer value = words.get(key) != null ? words.get(key) + 1 : 1;

            words.put(key, value);
        }
    }

    // Function that handles printing the data.
    public void printData() {
        int i;
        List<Map.Entry<String, Integer>> values = new ArrayList<>(words.entrySet());

        // Sort the entries by value.
        values.sort(Map.Entry.comparingByValue());

        // Output the entries in reverse to display the largest values first.
        for (i = values.size() - 1; i >= 0; i--) {
            System.out.println(values.get(i).getKey() + ":\t" + "*".repeat(values.get(i).getValue()));
        }
    }
}
