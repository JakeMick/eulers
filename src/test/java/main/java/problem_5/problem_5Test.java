package main.java.problem_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_5Test {

    @Test
    public void testInternal() {
        assertEquals("the smallest number that is evenly divisible by 1..10 is 2520", problem_5.internal(10), 2520);
    }

    @Test
    public void testAns() {
        assertEquals("the smallest number that is evenly divisible by 1..20 is ", problem_5.ans(), 232792560);
    }

}
