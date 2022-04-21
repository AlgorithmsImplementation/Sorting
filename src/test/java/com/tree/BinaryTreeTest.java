package com.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

@Slf4j
class BinaryTreeTest {

    @Test
    public void insertTest(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(100);
        binaryTree.insert(2);
        Node rootNode = binaryTree.insert(15);

        binaryTree.inOrder();

        log.info("Min : {}", binaryTree.findMin(rootNode));
        log.info("Min : {}", binaryTree.findMinRec(rootNode));
        log.info("Max : {}", binaryTree.findMax(rootNode));
        log.info("Max : {}", binaryTree.findMaxRec(rootNode));

        log.info("Height : {}", binaryTree.findHeight(rootNode));

        binaryTree.levelOrderTraversal(rootNode);
    }

    @Test
    public void traversalTest(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(100);
        binaryTree.insert(2);
        Node rootNode = binaryTree.insert(15);

        binaryTree.preOrderTraversal(rootNode);
        binaryTree.inOrderTraversal(rootNode);
        binaryTree.postOrderTraversal(rootNode);
    }

    @Test
    public void searchTest(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(100);
        binaryTree.insert(2);
        Node rootNode = binaryTree.insert(15);

        log.info("Node : {}", binaryTree.search(rootNode, 100));
    }

    @Test
    public void deleteNode(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(100);
        binaryTree.insert(2);
        Node rootNode = binaryTree.insert(15);

        binaryTree.inOrderTraversal(rootNode);

        Node rootNodeAfterDeletion = binaryTree.deleteNode(rootNode, 100);

        binaryTree.inOrderTraversal(rootNodeAfterDeletion);
    }

}