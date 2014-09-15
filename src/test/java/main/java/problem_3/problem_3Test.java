package main.java.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_3Test {

    @Test
    public void testInternal() throws Exception {
        assertEquals("The largest prime factor of 13195 is 29.", problem_3.internal(13195), 29);
    }

    @Test
    public void testAns() throws Exception {
        assertEquals("The largest prime factor of 600851475143 is", problem_3.ans(), 6857);
    }
}
