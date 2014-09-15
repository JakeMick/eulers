package main.java.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_2Test {

    @Test
    public void testInternal() throws Exception {
        assertEquals("the sum of the even part of the fib sequence less than 90 is", problem_2.internal(90), 44);
    }

    @Test
    public void testAns() throws Exception {
        assertEquals("the sum of the even part of the fib sequence less than 4 million is", problem_2.ans(), 4613732);
    }

}