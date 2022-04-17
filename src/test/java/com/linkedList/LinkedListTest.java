package com.linkedList;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    public void displayTest(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(10);
        linkedList.insertFirst(5);
        linkedList.insertLast(100);
        linkedList.insert(50, 3);
        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.delete(2);
        linkedList.display();
    }
}