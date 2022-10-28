package com.example.minspringboot.controllers;

import com.example.minspringboot.services.MinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MinController {

    private final MinService minService;

    @GetMapping("/")
    public ResponseEntity<String> getBasic() {
        String response = minService.basic();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
