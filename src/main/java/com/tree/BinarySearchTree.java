package com.tree;

/**
 * BinarySearch Tree implementation
 */
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
}
