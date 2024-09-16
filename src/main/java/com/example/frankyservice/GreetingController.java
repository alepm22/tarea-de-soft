package com.example.frankyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greeting() {
        return greetingService.getGreeting();
    }

    @GetMapping("/{name}")
    public String greetingWithName(@PathVariable String name) {
        return greetingService.getGreetingWithName(name);
    }

    @GetMapping("/{name}/{lang}")
    public String getGreetingWithNameAndLanguage(
            @PathVariable("name") String name,
            @PathVariable("lang") String language) {
        return greetingService.getGreetingWithNameAndLanguage(name, language);
    }

}