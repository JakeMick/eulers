package main.java.primes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class primesTest {
    @Test
    public void testNthPrimes() {
        assertEquals("the 10th prime is 29", primes.nth_prime(10), 29);
        assertEquals("the 1000th prime is 7919", primes.nth_prime(1000), 7919);
    }
}
