package com.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class BinarySearchTreeTest {

    @Test
    public void insertTest(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(100);
        binarySearchTree.insert(2);
        Node rootNode = binarySearchTree.insert(15);

        binarySearchTree.inOrder();

        log.info("Min : {}", binarySearchTree.findMin(rootNode));
        log.info("Min : {}", binarySearchTree.findMinRec(rootNode));
        log.info("Max : {}", binarySearchTree.findMax(rootNode));
        log.info("Max : {}", binarySearchTree.findMaxRec(rootNode));

        log.info("Height : {}", binarySearchTree.findHeight(rootNode));
    }

}