package com.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    /**
     * Basic idea is to move the left pointer when we encounter a duplicate
     * till we remove that duplicate from the set and keep going and calculate
     * the max
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int start = 0;
        int end = 0;
        int maxLength = 1;

        Set<Character> duplicateCheck = new HashSet<>();

        while(end < s.length()){
            if(duplicateCheck.contains(s.charAt(end))){
                while(duplicateCheck.contains(s.charAt(end))){
                    duplicateCheck.remove(s.charAt(start));
                    start++;
                }
            }

            maxLength = Math.max(maxLength, end-start+1);
            duplicateCheck.add(s.charAt(end));
            end++;
        }


        return maxLength;
    }
}
