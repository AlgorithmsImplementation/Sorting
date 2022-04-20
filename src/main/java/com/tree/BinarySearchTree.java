package com.tree;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public Node insertNode(int data){
        Node node = new Node(data);

        if(rootNode == null){
            rootNode = node;
            return rootNode;
        }

        Node prev = null;
        Node temp = rootNode;

        while(temp !=null){
            if(temp.val > data){
                prev = temp;
                temp = temp.left;
            }else{
                prev = temp;
                temp = temp.right;
            }
        }

        if(prev.val > data){
            prev.left = node;
        }else {
            prev.right = node;
        }

        return rootNode;
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

    public void inOrderStack(){
        if(rootNode == null){
            log.info("Empty Tree");
        }

        Stack<Node> stack = new Stack<>();
        Node tmp = rootNode;

        while(tmp!=null){

        }
    }

    public Node findMin(Node rootNode){
        if(rootNode == null){
            return new Node(-1);
        }

        Node minNode = rootNode;
        while(minNode.left != null){
            minNode = minNode.left;
        }

        return minNode;
    }

    public Node findMinRec(Node rootNode){
        if(rootNode == null){
            return new Node(-1);
        }

        if(rootNode.left == null){
            return rootNode;
        }

        return findMinRec(rootNode.left);
    }

    public Node findMaxRec(Node rootNode){
        if(rootNode == null){
            return new Node(-1);
        }

        if(rootNode.right == null){
            return rootNode;
        }

        return findMaxRec(rootNode.right);
    }

    public Node findMax(Node rootNode){
        if(rootNode == null){
            return new Node(-1);
        }

        Node maxNode = rootNode;
        while(maxNode.right!=null){
            maxNode = maxNode.right;
        }

        return maxNode;
    }

    /**
     * Calculate the height of the tree
     * @param rootNode
     * @return
     */
    public int findHeight(Node rootNode){

        if(rootNode== null){
            return -1;
        }

        int leftHeight = findHeight(rootNode.left);
        int rightHeight = findHeight(rootNode.right);

        return Math.max(leftHeight, rightHeight) + 1 ;
    }

    /**
     * Level order traversal of the tree
     *
     * @param rootNode
     */
    public void levelOrderTraversal(Node rootNode){
        Queue<Node> queue = new LinkedList();
        queue.add(rootNode);

        while(!queue.isEmpty()){
            rootNode = queue.poll();

            log.info("Val: {}", rootNode);
            if(rootNode.left!=null){
                queue.add(rootNode.left);
            }

            if(rootNode.right!=null){
                queue.add(rootNode.right);
            }
        }
    }

    public void preOrderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }

        log.info("Val : {}", rootNode);
        preOrderTraversal(rootNode.left);
        preOrderTraversal(rootNode.right);
    }

    public void inOrderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }

        inOrderTraversal(rootNode.left);
        log.info("Val : {}", rootNode);
        inOrderTraversal(rootNode.right);
    }

    public void postOrderTraversal(Node rootNode){
        if(rootNode==null){
            return;
        }

        postOrderTraversal(rootNode.left);
        postOrderTraversal(rootNode.right);
        log.info("Val : {}", rootNode);
    }
}
