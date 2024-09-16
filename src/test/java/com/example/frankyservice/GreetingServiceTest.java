package com.example.frankyservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    void getGreeting() {
        assertEquals(
                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.",
                greetingService.getGreeting()
        );
    }

    @Test
    void getGreetingWithName() {
        String name = "Roberto";
        assertEquals(
                "Roberto. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.",
                greetingService.getGreetingWithName(name)
        );
    }

    @Test
    void getGreetingWithNameAndLanguage() {
        String name = "Roberto";

        // Test para idioma francés
        assertEquals(
                "Roberto. Demandez-vous si ce que vous faites aujourd'hui vous rapproche de l'endroit où vous voulez être demain.",
                greetingService.getGreetingWithNameAndLanguage(name, "fr")
        );

        // Test para idioma español
        assertEquals(
                "Roberto. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.",
                greetingService.getGreetingWithNameAndLanguage(name, "es")
        );

        // Test para idioma inglés
        assertEquals(
                "Roberto. Ask yourself if what you are doing today is getting you closer to where you want to be tomorrow.",
                greetingService.getGreetingWithNameAndLanguage(name, "en")
        );
    }
}
