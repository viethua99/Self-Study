package com.vproject.study.datastructures.linked_list.doubly_linked_list;

public class DoublyNode {
    private int value;
    private DoublyNode nextNode;
    private DoublyNode previousNode;

    public DoublyNode(int value) {
        this.value = value;
        this.nextNode = null;
        this.previousNode = null;
    }

    public DoublyNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyNode previousNode) {
        this.previousNode = previousNode;
    }

    public DoublyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
