package com.tree;

import lombok.extern.slf4j.Slf4j;

/**
 * BinarySearch Tree implementation
 */
@Slf4j
public class BinarySearchTree {
    private Node rootNode;

    public BinarySearchTree() {
        this.rootNode = null;
    }

    public BinarySearchTree(Node rootNode) {
        this.rootNode = rootNode;
    }

    public Node insert(int data){
        rootNode = insertRec(rootNode, data);
        return rootNode;
    }

    private Node insertRec(Node rootNode, int data){

        if(rootNode == null){
            rootNode = new Node(data);
            return rootNode;
        }

        if(rootNode.val > data){
            rootNode.left = insertRec(rootNode.left, data);
        }else {
            rootNode.right = insertRec(rootNode.right, data);
        }

        return rootNode;
    }

    public void inOrder(){
        inOrderRec(rootNode);
    }

    private void inOrderRec(Node rootNode){
        if(rootNode!=null){
            log.info("Val: {}", rootNode.val);
            inOrderRec(rootNode.left);
            inOrderRec(rootNode.right);
        }
    }
}
