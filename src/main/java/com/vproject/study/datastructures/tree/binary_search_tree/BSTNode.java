package com.vproject.study.datastructures.tree.binary_search_tree;

public class BSTNode {
    private int value;
    private BSTNode leftNode;
    private BSTNode rightNode;

    public BSTNode(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BSTNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BSTNode leftNode) {
        this.leftNode = leftNode;
    }

    public BSTNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BSTNode rightNode) {
        this.rightNode = rightNode;
    }
}
