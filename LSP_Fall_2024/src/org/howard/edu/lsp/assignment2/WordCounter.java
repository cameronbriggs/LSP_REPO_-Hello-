/**
 * Name: Cameron Briggs
 */

package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String filename = "src/org/howard/edu/lsp/assignment2/words.txt";  
        wordCount(filename);
    }

    public static void wordCount(String filename) {
        Map<String, Integer> wordCounts = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File(filename));

            while (fileScanner.hasNext()) {
                String word = fileScanner.next().toLowerCase().replaceAll("[^a-z]", "");
                
                // Count the word
                if (!word.isEmpty()) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
