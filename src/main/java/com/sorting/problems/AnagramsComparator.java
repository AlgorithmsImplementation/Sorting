package com.sorting.problems;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Anagrams comparator
 */
public class AnagramsComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        return sortChars(left).compareToIgnoreCase(sortChars(right));
    }

    private String sortChars(String a){
        char[] b = a.toCharArray();
        Arrays.sort(b);

        return new String(b);
    }
}
