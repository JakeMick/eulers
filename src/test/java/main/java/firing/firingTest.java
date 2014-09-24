package main.java.firing;

import main.java.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class firingTest {

    @Test
    public void testMaxValue() {
        Tree<String> tree = firing.toyTree();
        int m = firing.maxValue(tree);
        assertEquals(10201, m);
    }

}