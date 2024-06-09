package com.andy.springboot.boilerplate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok().body("Hi, How are you?");
    }


}
