package com.string;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Subsequence {

    public ArrayList<String> subSequence(String value){
        ArrayList<String> output = new ArrayList<>();
        subSequence("", value, output);

        return output;
    }

    public ArrayList<String> subSequenceAscii(String value){
        ArrayList<String> output = new ArrayList<>();
        subSequenceAscii("", value, output);

        return output;
    }

    public void subSequenceAscii(String processed, String unprocessed, ArrayList<String> subSequence){
        if(unprocessed.isEmpty()){
            subSequence.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSequence(processed+ch, unprocessed.substring(1), subSequence);
        subSequence(processed+(ch+0), unprocessed.substring(1), subSequence);
        subSequence(processed, unprocessed.substring(1), subSequence);
    }


    public void subSequence(String processed, String unprocessed, ArrayList<String> subSequence){
        if(unprocessed.isEmpty()){
            subSequence.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSequence(processed+ch, unprocessed.substring(1), subSequence);
        subSequence(processed, unprocessed.substring(1), subSequence);
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
