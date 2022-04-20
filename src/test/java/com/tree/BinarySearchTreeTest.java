package com.tree;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    public void insertTest(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(100);
        binarySearchTree.insert(2);
        binarySearchTree.insert(15);

        binarySearchTree.inOrder();
    }

}