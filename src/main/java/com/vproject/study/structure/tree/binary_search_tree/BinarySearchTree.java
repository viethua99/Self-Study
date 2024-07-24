package com.vproject.study.structure.tree.binary_search_tree;

public class BinarySearchTree {
    BSTNode rootNode;

    public BinarySearchTree() {
        this.rootNode = null;
    }

    public void insert(int value) {
        rootNode = insertRecursive(rootNode, value);
    }
    private BSTNode insertRecursive(BSTNode root, int value) {
        if (root == null) {
            root = new BSTNode(value);
            return root;
        }

        if (value < root.getValue()) {
            root.setLeftNode(insertRecursive(root.getLeftNode(), value));
        }

        if (value > root.getValue()) {
            root.setRightNode(insertRecursive(root.getRightNode(), value));
        }
        return root;
    }

    // LNR order
    public void printInorder() {
        printInorderRecursive(rootNode);
    }
    private void printInorderRecursive(BSTNode root) {
        if (root != null) {
            printInorderRecursive(root.getLeftNode());
            System.out.print(root.getValue() + " ");
            printInorderRecursive(root.getRightNode());
        }
    }

    // Method to search for a key in the tree
    public boolean search(int key) {
        return searchRec(rootNode, key);
    }

    // A utility function to search for a key in BST
    private boolean searchRec(BSTNode root, int key) {
        if (root == null)
            return false;

        if (root.getValue() == key)
            return true;

        if (key < root.getValue())
            return searchRec(root.getLeftNode(), key);
        else
            return searchRec(root.getRightNode(), key);
    }

    // Method to find the minimum value in the tree
    public int findMin() {
        return findMinRec(rootNode);
    }

    // A utility function to find the minimum value in BST
    private int findMinRec(BSTNode root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.getLeftNode() == null)
            return root.getValue();

        return findMinRec(root.getLeftNode());
    }

    // Method to find the maximum value in the tree
    public int findMax() {
        return findMaxRec(rootNode);
    }

    // A utility function to find the maximum value in BST
    private int findMaxRec(BSTNode root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.getRightNode() == null)
            return root.getValue();

        return findMaxRec(root.getRightNode());
    }

}
