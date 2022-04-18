package com.linkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedNodeList {

    ListNode head;
    ListNode tail;

    private int size = 0;

    public LinkedNodeList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     * Insert at the firstIndex of linkedList
     *
     * @param val
     */
    public void insertFirst(int val){
        ListNode listNode = new ListNode(val);
        listNode.next = head;

        head = listNode;

        if(tail == null){
            tail = listNode;
        }

        size++;
    }

    /**
     * Insert at the lastIndex of linkedList
     *
     * @param val
     */
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }

        ListNode listNode = new ListNode(val);
        tail.next = listNode;
        tail = listNode;
        size++;
    }

    /**
     * Insert at a position of linkedList
     *
     * @param val
     * @param index
     */
    public void insert(int val, int index){

        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size){
            insertLast(val);
            return;
        }

        ListNode temp = head;
        for(int i =1; i < index ; i++){
            temp = temp.next;
        }

        ListNode listNode = new ListNode(val, temp.next);
        temp.next = listNode;

        size++;
    }

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    /**
     * Insert using recursion
     *
     * @param val
     * @param index
     * @param listNode
     * @return
     */
    private ListNode insertRec(int val, int index, ListNode listNode){
        if(index==0){
            ListNode temp = new ListNode(val, listNode.next);
            size++;
            return temp;
        }

        listNode.next = insertRec(val, index--, listNode.next);
        return listNode;
    }

    /**
     * Delete from head
     *
     * @return
     */
    public int deleteFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return val;
    }

    /**
     * Delete from tail
     *
     * @return
     */
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        ListNode secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    /**
     * Delete at position
     *
     * @param index
     * @return
     */
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index==size){
            return deleteLast();
        }

        ListNode prev = get(index-1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        return val;
    }

    /**
     * Read node at position
     *
     * @param index
     * @return
     */
    public ListNode get(int index){
        ListNode listNode = head;

        for(int i=0; i< index; i++){
            listNode = listNode.next;
        }

        return listNode;
    }

    /**
     * Print the linkedList
     */
    public void display(){
        ListNode temp = head;

        while(temp!=null){
            log.info("{} : {}", temp.val, "->");
            temp = temp.next;
        }
        log.info("END");

        log.info("Tail {}", tail);
    }
}
