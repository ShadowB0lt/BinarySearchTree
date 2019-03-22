package com.sparta.siq.model;


import java.util.List;

public class Tree implements BinaryTree {

    private Node root;


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

        if (root == null) {
            root = new Node(element);
        } else {
            insertNode(root, element);
        }
        /*
        if(root == null) {
            root = new Node(element);
        } else {
            Node newNode = new Node(element);
            if (element < root.getValue()) {

                if (root.getLeftChild() == null) {
                    root.setLeftChild(newNode);

                } else {
                    root.getLeftChild().setLeftChild(newNode);
                }
                if (element < newNode.getValue() && newNode.getLeftChild() == null) {
                    newNode.getLeftChild().setLeftChild(newNode);

                } else if (root.getLeftChild() != null || newNode.getLeftChild() != null) {
//                    if(){

//                    }else {

//                    }
                    //addElement(root.getLeftChild().getValue());
                }
            } else if (element > root.getValue() || element > newNode.getValue()) {
                if (root.getRightChild() == null) {
                    root.setRightChild(newNode);
                } else if (root.getRightChild() != null || newNode.getRightChild() != null) {
                    root.getRightChild().setRightChild(newNode);
                }
            }
        }
        */
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (root == null) {
                root = new Node(elements[0]);
            } else {
                insertNode(root, elements[i]);
            }
        }
    }

    @Override
    public boolean findElement(int value) {
//        if (root.getValue() == value) {
//            return true;
//        } else if (root.getLeftChild().getValue() == value) {
//            return true;
//        } else if (root.getRightChild().getValue() == value) {
//            return true;
//        } else {
//            return false;
//        }
        if (findNode(root, value))
        {
            return true;
        }
return false;
    }


    @Override
    public int getLeftChild(int element) {

        return root.getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) {
        return root.getRightChild().getValue();
    }

    @Override
    public List<Integer> getSortedTreeAsc() {
        return null;
    }

    @Override
    public List<Integer> getSortedTreeDesc() {
        return null;
    }

    public void insertNode(Node node, int element) {

        if (element < node.getValue()) {
            if (node.getLeftChild() != null) {
                insertNode(node.getLeftChild(), element);
            } else {
                node.setLeftChild(new Node(element));
            }
        } else if (element > node.getValue()) {
            if (node.getRightChild() != null) {
                insertNode(node.getRightChild(), element);
            } else {
                node.setRightChild(new Node(element));
            }
        }
    }

    public boolean findNode(Node node, int element) {

        if(node == null){return false;}
        if(element == node.getValue())
        {
            return true;
        }
        else if(element < node.getValue())
        {
            if(node.getLeftChild().getValue() != element || node.getLeftChild() == null)
            {
                findNode(node.getLeftChild(), element);
            }
            else {
                return true;
            }
        }
        else if(element > node.getValue())
        {
            if (node.getRightChild().getValue() == element||node.getRightChild() == null)
            {
                findNode(node.getRightChild(),element);
            }
            else
            {
                return true;

            }

        }
return false;
    }
}



