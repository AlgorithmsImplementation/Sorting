package com.tree;

public class BinarySearchTree {

    public boolean isBST(Node rootNode){
        if(rootNode==null){
            return true;
        }

//        return isBSTLesser(rootNode.left, rootNode.val) &&
//                isBSTGreater(rootNode.right, rootNode.val) &&
//                isBST(rootNode.left) && isBST(rootNode.right);

        return isBST(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node rootNode, int min, int max){
        if(rootNode==null){
            return true;
        }

        if(rootNode.val > min && rootNode.val < max
                && isBST(rootNode.left, min, rootNode.val)
                && isBST(rootNode.right, rootNode.val, max)){
            return true;
        }else {
            return false;
        }
    }

    private boolean isBSTLesser(Node rootNode, int value){
        if(rootNode==null){
            return true;
        }

        if(
                rootNode.val <= value
                && isBSTLesser(rootNode.left, rootNode.val )
                && isBSTLesser(rootNode.right, rootNode.val)
        ){
            return true;
        }else{
            return false;
        }
    }

    private boolean isBSTGreater(Node rootNode, int value){
        if(rootNode==null){
            return true;
        }

        if(
                rootNode.val >= value
                        && isBSTGreater(rootNode.left, rootNode.val)
                        && isBSTGreater(rootNode.right, rootNode.val)
        ){
            return true;
        }else{
            return false;
        }
    }
}
