package com.example.user.wordcount;

/**
 * Created by user on 08/11/2016.
 */

public class WordCount {

    public int go(String text) {
        String trimmedText = text.trim();
        String[] wordArray = trimmedText.split(" ");

        int numberOfStrings = wordArray.length;

        int numberOfEmptyStrings = 0;
        for (String string : wordArray) {
            if (string.equals("")) {
                numberOfEmptyStrings++;
            }
        }

        int numberOfWords = numberOfStrings - numberOfEmptyStrings;
        return numberOfWords;
    }

}
