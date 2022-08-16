package com.tree;

public class Node {
    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value) { // Node constructor
        leftNode = null;
        rightNode = null;
        this.value = value;
    } // end of Node

    public void setLeftNode(Node node){ // Set left node pointer
        this.leftNode = node;
    } // end of setLeftNode

    public void setRightNode(Node node){ // Set right node pointer
        this.rightNode = node;
    } // end of setRightNode

    public void setValue(int value){ // Set value for this Node
        this.value = value;
    } // end of setValue  **** FOR LATER USE ****

    public Node getLeftNode() { // return left node
        return leftNode;
    } // end of getLeftNode

    public Node getRightNode() { // return right node
        return rightNode;
    } // end of getRightNode

    public int getValue() { // return current value
        return value;
    } // end of getValue

    @Override
    public String toString() { // return String representation of Node
        String result = value + "";
        if (leftNode  != null) result = leftNode + "-" + result;
        if (rightNode != null) result = result + "-" + rightNode;
        return result;
    } // end of toString
} // end of Node class