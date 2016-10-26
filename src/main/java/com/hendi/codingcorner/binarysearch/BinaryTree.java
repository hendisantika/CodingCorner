package com.hendi.codingcorner.binarysearch;

import java.util.Stack;

/**
 *
 * @author hendisantika
 */
public class BinaryTree {

    static class TreeNode {

        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of binary tree
    TreeNode root;

    /**
     * Java method to print tree nodes in PreOrder traversal
     */
    public void preOrder() {
        preOrder(root);
    }

    /**
     * traverse the binary tree in PreOrder
     *
     * @param node - starting node, root
     */
    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * Java method to visit tree nodes in PreOrder traversal without recursion.
     */
    public void preOrderWithoutRecursion() {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);

        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            System.out.printf("%s ", current.data);

            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
    }
    
    

}
