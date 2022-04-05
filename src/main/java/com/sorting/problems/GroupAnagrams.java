package com.sorting.problems;

import java.util.Arrays;

public class GroupAnagrams {
    public String[] groupAnagarams (String[] list){
        Arrays.sort(list, new AnagramsComparator());

        return list;
    }
}

