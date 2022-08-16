package com.tree;

public class Tree {
    private Node rootNode;

    public void insertValue(int value) { // Create new Node with value and insert
        insertNode(new Node(value));
    } // end of insertValue

    public void insertNode(Node newNode) { // Insert new Node
        if (rootNode == null) {
            rootNode = new Node(newNode.getValue());
        } else {
            insertNode(rootNode, newNode);
        }
    } // end of insertNode

    public boolean containsValue(int value) { // Search tree for a value
        // return True/False
        return getNode(rootNode, value) != null;
    } // end of containsValue

    public Node getNode(Node currentNode, int value) { // Get Node if it contains value
        if (currentNode == null)
            return null;
        if (currentNode.getValue() == value)
            return currentNode;
        if (value < currentNode.getValue())
            return getNode(currentNode.getLeftNode(), value);
        return getNode(currentNode.getRightNode(), value);
    } // end of getNode

    private void insertNode(Node currentNode, Node newNode) { // Insert a new node
        if (newNode.getValue() < currentNode.getValue()) { // compare/sort
            if (currentNode.getLeftNode() == null) // check placement
                currentNode.setLeftNode(newNode);
            else
                insertNode(currentNode.getLeftNode(), newNode);
        }
        if (newNode.getValue() > currentNode.getValue()) {
            if (currentNode.getRightNode() == null)
                currentNode.setRightNode(newNode);
            else
                insertNode(currentNode.getRightNode(), newNode);
        }
    } // end of insertNode

    @Override
    public String toString() { // String representation of Tree
        if (rootNode != null) {
            return rootNode.toString();
        }
        return "";
    } // end of toString
} // end of class Tree