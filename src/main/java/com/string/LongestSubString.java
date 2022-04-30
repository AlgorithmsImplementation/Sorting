package com.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

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
