package com.map;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class MapTest {

    @Test
    public void playMap(){
        Map<Integer , Integer> map = new HashMap<>();

        //Build the map
        for(int i=0; i<50; i++){
            map.put(i, i);
        }

//        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            log.info("key: {}, val: {}", entry.getKey(), entry.getValue());
//        }
//
//        log.info(String.valueOf(map.getOrDefault(100, 0)));
//        map.forEach((k,v) -> {
//            log.info("key: {} val: {}", k, v);
//        });

        Map<Integer, Integer> modifiedMap = map.entrySet().stream().map(entry -> {
            int key = entry.getKey();
            int value = entry.getValue();
            entry.setValue(value++);
            return entry;
        }).collect(Collectors.toMap(x -> x.getKey(), val -> val.getValue()));

        modifiedMap.entrySet().forEach(entry -> {
            log.info("key: {} and val: {}", entry.getKey(), entry.getValue());
        });
    }
}
