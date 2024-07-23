package com.vproject.study.structure.linked_list.singly_linked_list;

public class SinglyLinkedList {
    private SinglyNode headNode;
    private int length;

    public SinglyLinkedList() {
        headNode = null;
        length = 0;
    }

    public void append(int value) {
        SinglyNode newNode = new SinglyNode(value);
        length++;

        if (headNode == null) {
            headNode = newNode;
        } else {
           SinglyNode lastNode = headNode;
           while (lastNode.getNextNode() != null) {
               lastNode = lastNode.getNextNode();
           }
           lastNode.setNextNode(newNode);
        }
    }

    public void insertAt(int value, int position) {
        if (position >= 0 && position < length) {
            SinglyNode newNode = new SinglyNode(value);
            if (position == 0) {
                newNode.setNextNode(headNode);
                headNode = newNode;
            } else {
                SinglyNode previousNode = headNode;
                int counter = 1;
                while (counter < position) {
                    previousNode = previousNode.getNextNode();
                    counter++;
                }
                newNode.setNextNode(previousNode.getNextNode());
                previousNode.setNextNode(newNode);
            }
            length++;
        }
    }

    public void removeAt(int position) {
        if (position >= 0 && position < length) {
            if (position == 0) {
                headNode = headNode.getNextNode();
            } else {
                SinglyNode previousNode = headNode;
                int counter = 1;
                while (counter < position) {
                    previousNode = previousNode.getNextNode();
                    counter++;
                }
                SinglyNode targetNode = previousNode.getNextNode();
                previousNode.setNextNode(targetNode.getNextNode());
            }
            length--;
        }
    }

    public void clear() {
        headNode = null;
        length = 0;
    }

    public void printList() {
        SinglyNode lastNode = headNode;

        while (lastNode != null) {
            System.out.print(lastNode.getValue() + " ");
            lastNode = lastNode.getNextNode();
        }
        System.out.println();
        System.out.println("Size: " + length);
    }
}
