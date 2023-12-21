package com.example.lab_2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testWordCount() {
        String text = "Hello World";
        int result = TextCounter.getWordCount(text);
        assertEquals(2, result);  // Assuming "Hello World" has 2 words
    }

    @Test
    public void testCharCount() {
        String text = "Hello";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(5, result);  // Assuming "Hello" has 5 characters
    }

    @Test
    public void testWordCount_EmptyText() {
        String text = "";
        int result = TextCounter.getWordCount(text);
        assertEquals(0, result);  // An empty string should have 0 words
    }

    @Test
    public void testWordCount_OnlyWhitespace() {
        String text = "  \t  ";
        int result = TextCounter.getWordCount(text);
        assertEquals(0, result);  // Only whitespace should be considered 0 words
    }

    @Test
    public void testWordCount_MultipleSpaces() {
        String text = "Hello   World";
        int result = TextCounter.getWordCount(text);
        assertEquals(2, result);  // Multiple spaces should be treated as one word separator
    }

    @Test
    public void testWordCount_SpecialCharacters() {
        String text = "Hello! World?";
        int result = TextCounter.getWordCount(text);
        assertEquals(2, result);  // Special characters should not split words
    }


    @Test
    public void testCharCount_EmptyText() {
        String text = "";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(0, result);  // An empty string should have 0 characters
    }

    @Test
    public void testCharCount_WithWhitespace() {
        String text = "Hello World";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(11, result);  // Including spaces
    }

    @Test
    public void testCharCount_SpecialCharacters() {
        String text = "Hello! World?";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(13, result);  // Including special characters
    }

    @Test
    public void testCharCount_MultiByteCharacters() {
        String text = "你好";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(2, result);  // Counting multi-byte characters as two characters
    }

}