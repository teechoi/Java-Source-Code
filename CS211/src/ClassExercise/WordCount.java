package ClassExercise;/*
Tyler Choi
CS 211 Winter Quarter
01/23/20

This class is modified to print words that occur more than 1000 times in the text file

 * Your file header comment block goes above this line
 *
 * WordCount uses a map to implement a word count, so that the user can see 
 * which words occur the most frequently in the book "Moby Dick". Note the use
 * of a class constant to govern the output size.
 */

import java.io.*;
import java.util.*;

public class WordCount {
    // minimum number of occurrences needed to be printed
    public static final int OCCURRENCES = 1000;

    public static void main(String[] args) 
            throws FileNotFoundException {
        System.out.println("This program displays the most");
        System.out.println("frequently occurring words from");
        System.out.println("the book Moby Dick.");
        System.out.println();
        
        // read the book into a map
        Scanner in = new Scanner(new File("mobydick.txt"));
        in.useDelimiter("[^a-zA-Z']+"); //treat any character not in the alphabet or apostrophe as white space
        Map<String, Integer> wordCountMap = getCountMap(in);

        //new TreeMap that accepts word count as key and word as value
        Map<Integer, String> wordFrequencyMap = new TreeMap<>();
        for (String word: wordCountMap.keySet()) {
            wordFrequencyMap.put(wordCountMap.get(word), word);
        }

        //print word occurrences in numerical hierarchy
        for (Integer count: wordFrequencyMap.keySet()) {
            String word = wordFrequencyMap.get(count);
            if (count > OCCURRENCES) {
                System.out.println("\"" + word + "\" occurs " + count + " times.");
            }
        }
    }
    
    // Reads book text and returns a map from words to counts
    public static Map<String, Integer> getCountMap(Scanner in) {
        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

        while (in.hasNext()) {
            String word = in.next().toLowerCase();
            if (!wordCountMap.containsKey(word)) {
                // never seen this word before
                wordCountMap.put(word, 1);
            } else {
                // seen this word before; increment count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
        }
        
        return wordCountMap;
    }
}
