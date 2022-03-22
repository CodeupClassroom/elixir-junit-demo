package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void stringEqualsTest() {
        assertEquals("Codeup", "Codeup");
        assertNotEquals("Codeup", "CodeUp");
        assertSame("Code1111up", "Codeup");
        assertNotSame("Codeup", "CodeUp");
    }
}
