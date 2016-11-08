package com.example.user.wordcount;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 08/11/2016.
 */

public class WordCountTest {

    WordCount wordCount;
    String text;

    @Before
    public void before() {
        wordCount = new WordCount();
        text = "This is some  text to   test the WordCount.  It contains   twelve words. ";
    }

    @Test
    public void testGo() {
        assertEquals(12, wordCount.go(text));
    }

}
