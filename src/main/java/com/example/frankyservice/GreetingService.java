package com.example.frankyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class GreetingService {

    private final Map<String, String> greetings;

    @Autowired
    public GreetingService(GreetingProperties greetingProperties) {
        this.greetings = greetingProperties.getMessages();
    }

    public String getGreeting() {
        return greetings.getOrDefault("es", "Mensaje no disponible");
    }

    public String getGreetingWithName(String name) {
        return name + ". " + greetings.getOrDefault("es", "Mensaje no disponible");
    }

    public String getGreetingWithNameAndLanguage(String name, String language) {
        String message = greetings.getOrDefault(language, greetings.get("es"));
        return name + ". " + message;
    }
}
