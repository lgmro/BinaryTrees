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

    public void inOrder() {
        inOrder(this.root);
    }

    public void preOrder() {
        preOrder(this.root);
    }

    public void postOrder() {
        postOrder(this.root);
    }

    public int minimum() {
        return  minimum(this.root).info;
    }

    public int maximum() {
        return  maximum(this.root).info;
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
            System.out.println("Value " + node.info + " founded.");
            return;
        }
        
        if (value < node.info) {
            findValue(value, node.leftChild);
        } else {
            findValue(value, node.rightChild);
        }
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftChild);
            System.out.println("Visit: " + node.info);
            inOrder(node.rightChild);
        }
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println("Visit: " + node.info);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println("Visit: " + node.info);
        }
    }

    private Node minimum(Node node) {
        Node last;
        if (node.leftChild == null) {
            return node;
        }

        last = minimum(node.leftChild);

        return last;
    }

    private Node maximum(Node node) {
        Node last;
        if (node.rightChild == null) {
            return node;
        }

        last = maximum(node.rightChild);

        return last;
    }
}
