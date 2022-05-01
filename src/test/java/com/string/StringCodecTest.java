package com.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class StringCodecTest {

    StringCodec codec = new StringCodec();

    @Test
    public void stringCodecTest(){
      List<String> input = Arrays.asList("Hello","World");
      assertEquals(input, codec.decode(codec.encode(input)));

      List<String> emptyInput = Arrays.asList("", "");
      assertEquals(emptyInput, codec.decode(codec.encode(emptyInput)));

      List<String> emptyInput1 = Arrays.asList("");
      assertEquals(emptyInput1, codec.decode(codec.encode(emptyInput1)));

      List<String> emptyInput2 = Arrays.asList();
      assertEquals(emptyInput2, codec.decode(codec.encode(emptyInput2)));
    }

}