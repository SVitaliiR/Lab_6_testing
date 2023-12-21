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
        assertEquals(2, result);
    }

    @Test
    public void testCharCount() {
        String text = "Hello";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(5, result);
    }

    @Test
    public void testWordCount_EmptyText() {
        String text = "";
        int result = TextCounter.getWordCount(text);
        assertEquals(0, result);
    }

    @Test
    public void testWordCount_OnlyWhitespace() {
        String text = "  \t  ";
        int result = TextCounter.getWordCount(text);
        assertEquals(0, result);
    }

    @Test
    public void testWordCount_MultipleSpaces() {
        String text = "Hello   World";
        int result = TextCounter.getWordCount(text);
        assertEquals(2, result);
    }

    @Test
    public void testWordCount_SpecialCharacters() {
        String text = "Hello! World?";
        int result = TextCounter.getWordCount(text);
        assertEquals(2, result);
    }


    @Test
    public void testCharCount_EmptyText() {
        String text = "";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(0, result);
    }

    @Test
    public void testCharCount_WithWhitespace() {
        String text = "Hello World";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(11, result);
    }

    @Test
    public void testCharCount_SpecialCharacters() {
        String text = "Hello! World?";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(13, result);
    }

    @Test
    public void testCharCount_MultiByteCharacters() {
        String text = "你好";
        int result = CharsCounter.getChartsCount(text);
        assertEquals(2, result);
    }

}