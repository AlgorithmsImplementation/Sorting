package com.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Subsequence {

    public void subSequence(String value){
        subSequence("", value);
    }
    public void subSequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            log.info(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSequence(processed+ch, unprocessed.substring(1));
        subSequence(processed, unprocessed.substring(1));
    }


    public int strStr(String haystack, String needle) {

        if(needle.isEmpty()){
            return 0;
        }

        return strStr(haystack, 0, needle);
    }

    public int strStr(String hayStack, int index, String needle){
        if(hayStack.isEmpty()){
            return -1;
        }

        if(hayStack.startsWith(needle)){
            return index;
        }

        return strStr(hayStack.substring(1), index+1, needle);
    }
}
