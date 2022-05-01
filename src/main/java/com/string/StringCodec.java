package com.string;

import java.util.*;
import java.util.stream.Collectors;

public class StringCodec {

    Map<String, String> encodeMap = new HashMap();
    Map<String, String> decodeMap = new HashMap();
    public static final String SEPARATOR = Character.toString((char)257);
    public static final String EMPTY_STRING = Character.toString((char)258);

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        String merged;

        if (strs.size() == 0) {
            merged = EMPTY_STRING;
        }else{
            StringBuilder builder = new StringBuilder();
            for(String str: strs){
                builder.append(str);
                builder.append(SEPARATOR);
            }

            builder.deleteCharAt(builder.length() -1);

            merged = builder.toString();
        }

        int hashCode = merged.hashCode();
        //Update the encodeMap
        encodeMap.put(merged, String.valueOf(hashCode));
        decodeMap.put(String.valueOf(hashCode), merged);

        return String.valueOf(hashCode);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String merged = decodeMap.get(s);
        if(merged.isEmpty()){
            return Arrays.asList("");
        }else if(merged.equals(EMPTY_STRING)){
            return new ArrayList<>();
        }else{
            return Arrays.stream(merged.split(SEPARATOR, -1))
                    .collect(Collectors.toList());
        }
    }
}
