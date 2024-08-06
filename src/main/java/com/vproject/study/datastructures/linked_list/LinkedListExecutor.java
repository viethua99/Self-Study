package com.vproject.study.datastructures.linked_list;

import com.vproject.study.datastructures.linked_list.doubly_linked_list.DoublyLinkedList;
import com.vproject.study.datastructures.linked_list.singly_linked_list.SinglyLinkedList;

public class LinkedListExecutor {
    public static void execute(LinkedListType linkedListType) {
        switch (linkedListType) {
            case SINGLY_LINKED_LIST:
                SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
                singlyLinkedList.append(2);
                singlyLinkedList.append(3);
                singlyLinkedList.append(5);
                singlyLinkedList.append(6);
                singlyLinkedList.append(8);
                singlyLinkedList.printList();

                singlyLinkedList.insertAt(7, 2);
                singlyLinkedList.printList();

                singlyLinkedList.insertAt(9, 0);
                singlyLinkedList.printList();
                singlyLinkedList.insertAt(12, 6);
                singlyLinkedList.printList();
                singlyLinkedList.removeAt(7);
                singlyLinkedList.printList();
                break;
            case DOUBLY_LINKED_LIST:
                DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
                doublyLinkedList.insertAtEnd(2);
                doublyLinkedList.insertAtEnd(3);
                doublyLinkedList.insertAtEnd(5);
                doublyLinkedList.insertAtEnd(6);
                doublyLinkedList.insertAtEnd(8);
                doublyLinkedList.printListForward();

                doublyLinkedList.insertAt(10, 4);
                doublyLinkedList.printListForward();
                break;
            case CIRCULAR_LINKED_LIST:
                break;
        }
    }
}
