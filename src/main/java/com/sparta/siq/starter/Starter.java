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
        BinaryTree tree = new Tree();
        tree.addElement(10);
        tree.addElement(7);
        tree.addElement(5);
        tree.addElement(6);
        tree.addElement(3);
        tree.addElement(8);
        System.out.println(tree.getRootElement());
    }
}
