package com.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;

@Slf4j
public class SortingComparatorPlay {
    public static class AnagramComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b){
            return a.compareTo(b);
        }
    }
}
