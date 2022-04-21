package com.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
@Slf4j
class BinarySearchTreeTest {

    @Test
    public void isBSTTest(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(100);
        binaryTree.insert(2);
        Node rootNode = binaryTree.insert(15);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        log.info("isBinary: {}", binarySearchTree.isBST(rootNode));
    }

}