/**
 * Class: CMSC201 
 * Instructor: Prof. Grinberg
 * Description: JUnit test class for testing methods in java.lang.String
 * Due: 07/07/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Zephaniah Ackah-Blay
 **/


package chapter6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringTest {

    private String testString;

    /**
     * Sets up the test fixture before each test method
     */
    @Before
    public void setUp() {
        testString = "Hello World";
    }

    /**
     * Test method for String.length()
     */
    @Test
    public void testLength() {
        assertEquals(11, testString.length());
        assertEquals(0, "".length());
    }

    /**
     * Test method for String.charAt(int index)
     */
    @Test
    public void testCharAt() {
        assertEquals('H', testString.charAt(0));
        assertEquals('d', testString.charAt(10));
    }

    /**
     * Test method for String.substring(int beginIndex)
     */
    @Test
    public void testSubstringSingleParam() {
        assertEquals("World", testString.substring(6));
        assertEquals("Hello World", testString.substring(0));
    }

    /**
     * Test method for String.substring(int beginIndex, int endIndex)
     */
    @Test
    public void testSubstringDoubleParam() {
        assertEquals("Hello", testString.substring(0, 5));
        assertEquals("World", testString.substring(6, 11));
    }

    /**
     * Test method for String.indexOf(int ch)
     */
    @Test
    public void testIndexOfChar() {
        assertEquals(0, testString.indexOf('H'));
        assertEquals(6, testString.indexOf('W'));
        assertEquals(-1, testString.indexOf('z'));
    }

    /**
     * Test method for String.indexOf(String str)
     */
    @Test
    public void testIndexOfString() {
        assertEquals(6, testString.indexOf("World"));
        assertEquals(0, testString.indexOf("Hello"));
        assertEquals(-1, testString.indexOf("Java"));
    }
}