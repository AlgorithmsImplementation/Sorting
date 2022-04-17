package com.linkedList;

/**
 * Both prev and next links
 */
public class DoubleNode {
    private int val;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode(int val, DoubleNode next, DoubleNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
