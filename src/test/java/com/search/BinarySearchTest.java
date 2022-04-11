package com.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BinarySearchTest {

    @Test
    public void searchTest(){
        BinarySearch binarySearch = new BinarySearch();

        ArrayList<Integer> searchSpace = new ArrayList<>();
        searchSpace.add(10);
        searchSpace.add(20);
        searchSpace.add(30);
        searchSpace.add(40);
        searchSpace.add(50);
        searchSpace.add(60);
        searchSpace.add(70);
        searchSpace.add(80);
        searchSpace.add(90);

        Assertions.assertEquals(1, binarySearch.search(searchSpace, 20));
    }

    @Test
    public void recursiveSearchTest(){
        BinarySearch binarySearch = new BinarySearch();

        ArrayList<Integer> searchSpace = new ArrayList<>();
        searchSpace.add(10);
        searchSpace.add(20);
        searchSpace.add(30);
        searchSpace.add(40);
        searchSpace.add(50);
        searchSpace.add(60);
        searchSpace.add(70);
        searchSpace.add(80);
        searchSpace.add(90);

        Assertions.assertEquals(1, binarySearch.recursiveSearch(searchSpace,0, searchSpace.size()-1, 20));
    }
}