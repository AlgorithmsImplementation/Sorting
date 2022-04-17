package com.linkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList {

    private Node head;
    private Node tail;

    private int size = 0;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.setNext(head);

        head = node;

        if(tail == null){
            tail = node;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.setNext(node);
        tail = node;
        size++;
    }

    public void insert(int val, int index){

        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i =1; i < index ; i++){
            temp = temp.getNext();
        }

        Node node = new Node(val, temp.getNext());
        temp.setNext(node);

        size++;
    }

    public int deleteFirst(){
        int val = head.getVal();
        head = head.getNext();

        if(head == null){
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.getVal();
        tail = secondLast;
        tail.setNext(null);

        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index==size){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.getNext().getVal();

        prev.setNext(prev.getNext().getNext());

        return val;
    }

    public Node get(int index){
        Node node = head;

        for(int i=0; i< index; i++){
            node = node.getNext();
        }

        return node;
    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            log.info("{} : {}", temp.getVal(), "->");
            temp = temp.getNext();
        }
        log.info("END");

        log.info("Tail {}", tail);
    }
}
