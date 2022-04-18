package com.linkedList;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SortLinkedListTest {

    @Test
    public void displayTest(){
        LinkedNodeList linkedList = new LinkedNodeList();
        linkedList.insertFirst(3);
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(4);

        linkedList.display();

        SortLinkedList sortLinkedList = new SortLinkedList();
        sortLinkedList.sortList(linkedList.head);

        linkedList.display();
    }

}