package isp.lab3;

import org.junit.Test;

import static org.junit.Assert.*;
import isp.lab3.exercise1.Tree;
public class TreeTest {
    @Test
    public void  testGrow(){
        Tree tree = new Tree();
        tree.grow(5);
        assertEquals(20,tree.getHeight());

        Tree tree1 = new Tree();
        tree1.grow(-1);
        assertEquals(15,tree1.getHeight());
    }
    @Test
    public void testTostring(){
        Tree tree = new Tree();
        tree.grow(3);
        assertEquals("Tree{" +
                "height=" + tree.getHeight() +
                '}',tree.toString());
    }
}
