package main.java.problem_1;

import static org.junit.Assert.assertEquals;

public class problem_1Test {

    @org.junit.Test
    public void testInternal() throws Exception {
        assertEquals("sum of 3s and 5s less than 10 should be 23", problem_1.internal(10), 23);
    }

    @org.junit.Test
    public void testAns() throws Exception {
        assertEquals("sum of 3s and 5s less than 1000 should be 233168", problem_1.ans(), 233168);
    }
}