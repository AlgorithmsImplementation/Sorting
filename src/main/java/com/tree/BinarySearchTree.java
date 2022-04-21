package com.tree;

public class BinarySearchTree {

    public boolean isBST(Node rootNode){
        return isBST(rootNode, rootNode.left.val, rootNode.right.val);
    }

    private boolean isBST(Node rootNode, int min, int max){
        if(rootNode==null){
            return true;
        }

        if(rootNode.val < min || rootNode.val > max){
            return false;
        }

        return isBST(rootNode.left, min, rootNode.val -1) && isBST(rootNode.right, rootNode.val +1, max);
    }
}
