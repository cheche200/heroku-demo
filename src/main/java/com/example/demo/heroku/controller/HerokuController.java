package com.example.demo.heroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HerokuController {

	@GetMapping("hello")
    public String hello() {
        return "Welcome to Heroku1";
    }

    @GetMapping("bye")
    public String bye(){return "Good bye";}

}
