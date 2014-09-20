package main.java.problem_8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_8Test {

    @Test
    public void testInternal() {
        assertEquals("the largest product of four consecutive digits is 9 * 9 * 8 * 9", problem_8.internal(4), 9 * 9 * 8 * 9);
    }

    @Test
    public void testAns() {
        assertEquals("the largest product of 13 consecutive digits is ", problem_8.ans(), 2091059712);
    }

}
