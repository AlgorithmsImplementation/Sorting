package com.string;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        int longest = Integer.MIN_VALUE;
        int start=0;
        int end=0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        while(end < s.length()){
            //read the character
            Character rightElement = s.charAt(end);
            int value = frequencyMap.getOrDefault(rightElement, 0);
            frequencyMap.put(rightElement, ++value);

            int windowLength = end-start+1;

            //find the most frequent element in map
            int mostFrequent = frequencyMap
                    .entrySet()
                    .stream().max(
                            Comparator.comparing(Map.Entry::getValue)
                    ).get().getValue();

            if(windowLength-mostFrequent > k){
                Character leftElement = s.charAt(start);
                int val = frequencyMap.get(leftElement);
                frequencyMap.put(leftElement, --val);
                start++;
            }

            longest = Math.max(longest, end-start+1);
            end++;
        }

        return longest;
    }
}
