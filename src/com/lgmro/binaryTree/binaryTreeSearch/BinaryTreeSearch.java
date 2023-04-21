package com.lgmro.binaryTree.binaryTreeSearch;

public class BinaryTreeSearch {
    private int size;
    private Node root;

    public BinaryTreeSearch() {
        this.size = 0;
        this.root = null;
    }

    public void insert(int value) {
        this.root = insert(value, this.root);
        this.size++;
    }
    
    public void findValue(int value) {
        findValue(value, this.root);
    }

    public int length() {
        return this.size;
    }
    private Node insert(int value, Node node) {
        if (node == null) {
            System.out.println("Value " + value + " inserted.");
            return new Node(value);
        }

        if (value < node.info) {
            System.out.println("Tree going to left.");
            node.leftChild = insert(value, node.leftChild);
        } else {
            System.out.println("Tree going to right.");
            node.rightChild = insert(value, node.rightChild);
        }

        return node;
    }
    
    private void findValue(int value, Node node) {
        if (node == null) {
            System.out.println("Value don't founded.");
            return;
        }
        
        if (node.info == value) {
            System.out.println("Value founded." + node.info);
            return;
        }
        
        if (value < node.info) {
            findValue(value, node.leftChild);
        } else {
            findValue(value, node.rightChild);
        }
    }
}
