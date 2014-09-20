package main.java.problem_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_6Test {

    @Test
    public void testAns() {
        assertEquals("The difference between the sum of the squares and the squared sum of the first one hundred natural numbers is", 25164150, problem_6.ans());
    }

    @Test
    public void testInternal() {
        assertEquals("The difference between the sum of the squares and the squared sum of the first ten natural numbers is 3052", problem_6.internal(10), 2640);
    }
}
