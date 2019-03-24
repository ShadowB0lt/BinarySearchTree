package com.sparta.siq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.sparta.siq.model.BinaryTree;
import com.sparta.siq.model.Tree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Starter.
 */
public class StarterTest
{
    /**
     * Rigorous Test :-)
     */
    private BinaryTree tree = new Tree();

    private int[] unSortedArray = {10,12,4,5,3,7,2,17,15,29,23,25};

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void getRootElementTest()
    {
        tree.addElements(unSortedArray);
        Assert.assertEquals(10,tree.getRootElement());
    }

    @Test
    public void getLeftChildTest()
    {
        tree.addElements(unSortedArray);
        Assert.assertEquals(3,tree.getLeftChild(4));
    }

    @Test
    public void getRightChildTest() {
        tree.addElements(unSortedArray);
        Assert.assertEquals(25,tree.getRightChild(23));
    }

    @Test
    public void getNumberOfElementsTest()
    {
        tree.addElements(unSortedArray);
        Assert.assertEquals(12,tree.getNumberOfElements());
    }

    @Test
    public void getElementTest()
    {
        tree.addElements(unSortedArray);
        Assert.assertEquals(true,tree.findElement(17));
    }


}
