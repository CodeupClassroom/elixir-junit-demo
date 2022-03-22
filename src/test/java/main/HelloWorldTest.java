package main;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class HelloWorldTest {
    private ArrayList<String> wordArray;

    @Before
    public void initTestData() {
        String [] words = {"the", "quick", "brown", "fox"};
        wordArray = new ArrayList<>(Arrays.asList(words));
    }

    @Test
    public void testAddInt() {
        assertEquals("testing 4 in add()", 4, HelloWorld.add(2, 2));
        assertEquals("testing 2bil2 in add()", 2_000_000_002, HelloWorld.add(2_000_000_000, 2));
    }

    @Test
    public void testAddDouble() {
        assertEquals("test .1 + .2", .3, HelloWorld.add(.1, .2), 5);
    }

    @Test
    public void testJoinWords() {
        assertEquals("the quick brown fox",
                HelloWorld.joinWords(wordArray, " "));
    }

}
