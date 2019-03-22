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
        int[] numbersInArray = {12,4,5,3};
        BinaryTree tree = new Tree();
        tree.addElement(10);
        tree.addElements(numbersInArray);
        System.out.println(tree.findElement(23));

        //System.out.println(tree.getRootElement());

    }
}
