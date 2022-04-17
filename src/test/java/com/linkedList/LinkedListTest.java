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
        linkedList.display();
        linkedList.insert(50, 3);
        linkedList.display();
        linkedList.deleteFirst();
        linkedList.display();
        linkedList.deleteLast();
        linkedList.display();
        linkedList.delete(2);
        linkedList.display();
    }
}