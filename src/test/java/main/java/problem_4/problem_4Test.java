package main.java.problem_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_4Test {

    @Test
    public void testInternal() {
        assertEquals("the largest palindrome that can be made from the product of 2 2-digit numbers is 9009", problem_4.internal(2), 9009);
    }

    @Test
    public void testAns() {
        assertEquals("the largest palindrome that can be made from the product of 2 3-digit numbers is 906609", problem_4.ans(), 906609);
    }

}
