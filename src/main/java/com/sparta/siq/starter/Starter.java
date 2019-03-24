package com.sparta.siq.starter;

import com.sparta.siq.model.*;
/**
 * Hello world!
 *
 */
public class Starter
{

    public static void main( String[] args )
    {
        int[] numbersInArray = {12,4,5,3,7,2,17,15,29,23,25};
        BinaryTree tree = new Tree();
        tree.addElement(10);
        tree.addElements(numbersInArray);

        /*
        System.out.println("Element in tree found: "+tree.findElement(5));
        System.out.println("LeftChild: "+tree.getLeftChild(10));
        System.out.println("RightChild: "+tree.getRightChild(10));
        System.out.println("Number of Elements: "+tree.getNumberOfElements());
        System.out.println(tree.getSortedTreeAsc());
        System.out.println(tree.getSortedTreeDesc());
        System.out.println(tree.getRootElement());
        */

    }
}
