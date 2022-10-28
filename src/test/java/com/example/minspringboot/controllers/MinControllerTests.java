package com.example.minspringboot.controllers;

import com.example.minspringboot.MinSpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = MinSpringBootApplication.class)
@AutoConfigureMockMvc
@Slf4j
public class MinControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getBasic_returnsJson() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/");

        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is("Successful Response")));
    }

}
