package com.vproject.study.datastructures.linked_list.doubly_linked_list;

public class DoublyLinkedList {
    private DoublyNode headNode;
    private DoublyNode tailNode;
    private int length;

    public DoublyLinkedList() {
        headNode = null;
        tailNode = null;
        length = 0;
    }

    public void insertAtBeginning(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            newNode.setNextNode(headNode);
            headNode.setPreviousNode(newNode);
            headNode = newNode;
        }
        length++;
    }

    public void insertAtEnd(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (tailNode == null) {
            tailNode = newNode;
            headNode = newNode;
        } else {
            tailNode.setNextNode(newNode);
            newNode.setPreviousNode(tailNode);
            tailNode = newNode;
        }
        length++;
    }

    public void insertAt(int value, int position) {
        if (position >= 0 && position < length) {

            if (position == 0) {
                insertAtBeginning(value);
            } else {
                DoublyNode newNode = new DoublyNode(value);
                DoublyNode previousNode = headNode;
                int counter = 1;

                while (counter < position) {
                    previousNode = previousNode.getNextNode();
                    counter++;
                }
                DoublyNode targetNode = previousNode.getNextNode();
                newNode.setNextNode(targetNode);
                newNode.setPreviousNode(previousNode);
                targetNode.setPreviousNode(newNode);
                previousNode.setNextNode(newNode);
            }
            length++;
        }
    }

    public void clear() {
        headNode = null;
        tailNode = null;
        length = 0;
    }

    public void printListForward() {
        DoublyNode currentNode = headNode;

        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNextNode();
        }

        System.out.println();
        System.out.println("Size: " + length);
    }

    public void printListBackward() {
        DoublyNode currentNode = tailNode;
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getPreviousNode();
        }

        System.out.println();
        System.out.println("Size: " + length);
    }
}
