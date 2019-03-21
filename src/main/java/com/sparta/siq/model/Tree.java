package com.sparta.siq.model;

import java.util.List;

public class Tree implements BinaryTree {

    private Node root = new Node();


    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {

        if(root.getValue() == 0) {
            root.setValue(element);
        }else {
            Node newNode = new Node(element);
            if (element < root.getValue() || element < newNode.getValue()) {
                if (root.getLeftChild() == null) {
                    root.setLeftChild(newNode);
                } else if (root.getLeftChild() != null || newNode.getLeftChild() !=null) {
                    if(){

                    }else {
                        root.getLeftChild().setLeftChild(newNode);
                    }
                    //addElement(root.getLeftChild().getValue());
                }
            } else if (element > root.getValue() || element> newNode.getValue()) {
                if(root.getRightChild() == null)
                {
                    root.setRightChild(newNode);
                }
                else if (root.getRightChild() != null || newNode.getRightChild() != null)
                {
                    root.getRightChild().setRightChild(newNode);
                }
            }

        }
    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        return false;
    }

    @Override
    public int getLeftChild(int element) {
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        return 0;
    }

    @Override
    public List<Integer> getSortedTreeAsc() {
        return null;
    }

    @Override
    public List<Integer> getSortedTreeDesc() {
        return null;
    }
}
