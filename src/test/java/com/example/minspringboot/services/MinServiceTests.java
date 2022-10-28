package com.example.minspringboot.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MinServiceTests {

    @Autowired
    private MinService minService;

    @Test
    public void basic_returnsCorrect() {
        String expected = "Successful Response";

        String actual = minService.basic();

        assertEquals(expected, actual);
    }

}
