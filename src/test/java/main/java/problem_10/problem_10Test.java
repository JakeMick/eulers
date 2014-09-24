package main.java.problem_10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_10Test {
    @Test
    public void testInternal() {
        assertEquals("the sum of the primes below 10 is 17", problem_10.internal(10), 17L);
    }

/*    @Test
    public void testAns() {
        assertEquals("the sum of primes below 2000000 is derp", problem_10.ans(), 42);
    }
*/
}
