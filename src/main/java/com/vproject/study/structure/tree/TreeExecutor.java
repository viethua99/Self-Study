package com.vproject.study.structure.tree;

import com.vproject.study.structure.linked_list.LinkedListType;
import com.vproject.study.structure.linked_list.doubly_linked_list.DoublyLinkedList;
import com.vproject.study.structure.linked_list.singly_linked_list.SinglyLinkedList;
import com.vproject.study.structure.tree.binary_search_tree.BinarySearchTree;

public class TreeExecutor {
    public static void execute(TreeType treeType) {
        switch (treeType) {
            case BINARY_SEARCH_TREE:
                BinarySearchTree binarySearchTree = new BinarySearchTree();
                // Insert some nodes
                binarySearchTree.insert(50);
                binarySearchTree.insert(30);
                binarySearchTree.insert(20);
                binarySearchTree.insert(40);
                binarySearchTree.insert(70);
                binarySearchTree.insert(60);
                binarySearchTree.insert(80);

                // Print inorder traversal of the tree
                System.out.println("Inorder traversal:");
                binarySearchTree.printInorder();

                // Find minimum and maximum values
                System.out.println("Minimum value in the tree: " + binarySearchTree.findMin());
                System.out.println("Maximum value in the tree: " + binarySearchTree.findMax());
                break;
            case AVL_TREE:
                break;
        }
    }
}