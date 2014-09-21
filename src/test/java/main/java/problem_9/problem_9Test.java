package main.java.problem_9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem_9Test {

    @Test
    public void testInternal() {
        assertEquals("the first pythagorean triplet whose sum is 12 has a product of 60", problem_9.internal(12), 60);
    }

    @Test
    public void testAns() {
        assertEquals("the first pythagorean triplet whose sum is 1000 has a product of 42???", problem_9.ans(), 31875000);
    }
}
