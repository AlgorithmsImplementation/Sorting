package com.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTree {

    public Node buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return buildTree(0, inorder.length-1,0,  postorder.length-1,
                postorder, map);
    }

    public Node buildTree(int inorderLeft,
                          int inorderRight,
                          int postorderLeft,
                          int postorderRight,
                          int[] postorder,
                          Map<Integer, Integer> map) {
        if(inorderLeft > inorderRight || postorderLeft > postorderRight){
            return null;
        }

        int rootVal = postorder[postorderRight];
        Node root = new Node(rootVal);
        //now find the mid inside inorder array to find left and right
        int midIndex = map.get(rootVal);
        int leftElements = midIndex - inorderLeft;

        root.left = buildTree(inorderLeft,
                midIndex-1,
                postorderLeft,
                postorderLeft + leftElements -1,
                postorder,
                map);

        root.right = buildTree(midIndex+1,
                inorderRight,
                postorderLeft + leftElements,
                postorderRight-1,
                postorder,
                map);

        return root;
    }


    public Node buildTreePreOrder(int inorderLeft,
                          int inorderRight,
                          int preorderLeft,
                          int preorderRight,
                          int[] preorder,
                          Map<Integer, Integer> map) {
        if(inorderLeft > inorderRight || preorderLeft > preorderRight){
            return null;
        }

        int rootVal = preorder[preorderLeft];
        Node root = new Node(rootVal);
        //now find the mid inside inorder array to find left and right
        int midIndex = map.get(rootVal);
        int leftElements = midIndex - inorderLeft;

        root.left = buildTree(inorderLeft,
                midIndex-1,
                preorderLeft+1,
                preorderRight,
                preorder,
                map);

        root.right = buildTree(midIndex+1,
                inorderRight,
                preorderLeft+leftElements+1,
                preorderRight,
                preorder,
                map);

        return root;
    }
}
