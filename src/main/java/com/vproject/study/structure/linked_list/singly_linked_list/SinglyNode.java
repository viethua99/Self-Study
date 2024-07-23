package com.vproject.study.structure.linked_list.singly_linked_list;

public class SinglyNode {
    private final int value;
    private SinglyNode nextNode;

    public SinglyNode(int value) {
        this.value = value;
        this.nextNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setNextNode(SinglyNode node) {
        this.nextNode = node;
    }

    public SinglyNode getNextNode() {
        return nextNode;
    }
}
