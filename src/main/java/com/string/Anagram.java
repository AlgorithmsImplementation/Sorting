package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] val1 = s.toCharArray();
        char[] val2 = t.toCharArray();

//         Arrays.sort(val1);
//         Arrays.sort(val2);

//         if(Arrays.toString(val1).equals(Arrays.toString(val2))){
//             return true;
//         }else{
//             return false;
//         }

        // A B C E
        // A B C D

        Map<Character, Integer> lookup = new HashMap();

        for(int i=0; i< val1.length; i++){
            int value = lookup.getOrDefault(val1[i], 0);
            lookup.put(val1[i], ++value);
        }

        for(int i=0; i< val2.length; i++){
            int value = lookup.getOrDefault(val2[i], 0);
            lookup.put(val2[i], --value);
        }

        Optional<Map.Entry<Character, Integer>> result = lookup.entrySet().stream().filter(entry -> {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            return value!=0;
        }).findAny();

        if(result.isPresent()){
            return false;
        }else{
            return true;
        }
    }
}
