package com.hendi.codingcorner.binarysearch;

/**
 *
 * @author hendisantika
 *
 * Java Program to traverse a binary tree using PreOrder traversal. In PreOrder
 * the node value is printed first, followed by visit to left and right subtree.
 * input: 1 / \ 2 5 / \ \ 3 4 6
 *
 * output: 1 2 3 4 5 6 Read more:
 * http://javarevisited.blogspot.com/2016/07/binary-tree-preorder-traversal-in-java-using-recursion-iteration-example.html#ixzz4MaJRYgTx
 */
public class PreOrderTraversal {

    public static void main(String[] args) throws Exception {

        // construct the binary tree given in question
        BinaryTree bt = new BinaryTree();
        BinaryTree.TreeNode root = new BinaryTree.TreeNode("1");
        bt.root = root;
        bt.root.left = new BinaryTree.TreeNode("2");
        bt.root.left.left = new BinaryTree.TreeNode("3");

        bt.root.left.right = new BinaryTree.TreeNode("4");
        bt.root.right = new BinaryTree.TreeNode("5");
        bt.root.right.right = new BinaryTree.TreeNode("6");

        // printing nodes in recursive preOrder traversal algorithm
        bt.preOrder();

        System.out.println();

        // traversing binary tree in PreOrder without using recursion
        bt.preOrderWithoutRecursion();

    }

}


