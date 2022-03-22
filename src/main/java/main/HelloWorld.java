package main;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    // adds a to b and returns that result
    public static int add(int a, int b) {
        return 4;
//        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // if given an arraylist of strings, produce a single concatenated string from all
        // the string elements with a given delimiter separating the individual strings

        // e.g., if an arraylist of "the", "quick", "brown", "fox"
        //   the function can return "the quick brown fox" or "the,quick,brown,fox"
        String [] words = {"the", "quick", "brown", "fox"};
        ArrayList<String> wordArray = new ArrayList<>(Arrays.asList(words));
//        System.out.println(wordArray);

//        String joinedWords = joinWords(wordArray, " ");
//        System.out.println(joinedWords);
//        joinedWords = joinWords(wordArray, " | ");
//        System.out.println(joinedWords);
        String joinedWords = Joiner.on(" ").join(wordArray);
        System.out.printf("%s\n", joinedWords);
        joinedWords = Joiner.on(" | ").join(wordArray);
        System.out.printf("%s\n", joinedWords);
    }

    public static String joinWords(ArrayList<String> words, String delimiter) {
        String result = "";
        // below loop is a fencepost loop
        // we don't want the delimiter on the last iteration
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            result += word;
            if(i < (words.size() - 1)) {
                result += delimiter;
            }
        }
        return result.trim();
    }
}
