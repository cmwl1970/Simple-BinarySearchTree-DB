package com.tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree myTree = new com.tree.Tree();
        myTree.insertValue(24);
        myTree.insertValue(12);
        myTree.insertValue(7);
        myTree.insertValue(11);
        myTree.insertValue(4);
        System.out.println("MyTree Values : " + myTree);
        System.out.println("Contains Values ? " + myTree.containsValue(10));
        System.exit(0);
    } // end of main method
} // end of class TreeTest