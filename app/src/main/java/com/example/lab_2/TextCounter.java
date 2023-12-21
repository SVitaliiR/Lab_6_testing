package com.example.lab_2;

public class TextCounter {
    public static int getWordCount(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        String[] words = text.split(("\\s+"));
        return words.length;
    }
}
