package com.lgmro.binaryTree;

import com.lgmro.binaryTree.binaryTreeSearch.BinaryTreeSearch;

public class Main {
    public static void main(String[] args) {
        BinaryTreeSearch tree = new BinaryTreeSearch();
        tree.insert(10);
        tree.insert(3);
        tree.insert(12);
        tree.insert(11);

        System.out.println(tree.length());
        tree.findValue(4);
        tree.findValue(12);
    }
}
