/**
 * Class: CMSC201 
 * Instructor: Prof. Grinberg
 * Description:  JUnit test class for testing isPrime method in PrimeNumberMethod
 * Due: 07/07/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Zephaniah Ackah-Blay
 **/

package chapter6;  // Must match the package of the class being tested

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeNumberMethodTest {

    /**
     * Test method for isPrime with prime numbers
     */
    @Test
    public void testIsPrimeWithPrimes() {
        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(3));
        assertTrue(PrimeNumberMethod.isPrime(5));
        assertTrue(PrimeNumberMethod.isPrime(7));
        assertTrue(PrimeNumberMethod.isPrime(11));
        assertTrue(PrimeNumberMethod.isPrime(13));
        assertTrue(PrimeNumberMethod.isPrime(17));
    }

    /**
     * Test method for isPrime with non-prime numbers
     */
    @Test
    public void testIsPrimeWithNonPrimes() {
        assertFalse(PrimeNumberMethod.isPrime(1));
        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(6));
        assertFalse(PrimeNumberMethod.isPrime(8));
        assertFalse(PrimeNumberMethod.isPrime(9));
        assertFalse(PrimeNumberMethod.isPrime(10));
        assertFalse(PrimeNumberMethod.isPrime(12));
    }

    /**
     * Test method for isPrime with edge cases
     */
    @Test
    public void testIsPrimeEdgeCases() {
        assertFalse(PrimeNumberMethod.isPrime(0));
        assertFalse(PrimeNumberMethod.isPrime(-1));
        assertFalse(PrimeNumberMethod.isPrime(-5));
    }

    /**
     * Test method for isPrime with larger numbers
     */
    @Test
    public void testIsPrimeWithLargeNumbers() {
        assertTrue(PrimeNumberMethod.isPrime(997)); // Largest prime < 1000
        assertFalse(PrimeNumberMethod.isPrime(1000));
        assertTrue(PrimeNumberMethod.isPrime(7919)); // 1000th prime
    }
}