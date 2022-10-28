package com.example.minspringboot.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MinService {

    public String basic() {
        return "Successful Response";
    }

}
