package com.example.lab_2;

public class TextCounter {
    public static int getWordCount(String text) {
        String[] words = text.split(("\\s+"));
        return words.length;
    }
}
