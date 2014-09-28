package main.java.problem_10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_10Test {
    @Test
    public void testInternal() {
        assertEquals("the sum of the primes below 10 is 17", problem_10.internal(10), 17);
    }

    @Test
    public void testAns() {
        assertEquals("the sum of the primes below 2 million is 142913828922", problem_10.ans(), 142913828922L);
    }

}
