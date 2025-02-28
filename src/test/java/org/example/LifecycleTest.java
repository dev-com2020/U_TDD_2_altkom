package org.example;

import org.junit.jupiter.api.*;

public class LifecycleTest {

    @BeforeAll
    static void setupAll(){
        System.out.println("Setup przed WSZYSTKIMI testami w klasie");
    }

    @BeforeEach
    void setup(){
        System.out.println("Setup przed KAŻDYM testem w klasie");
    }

    @Test
    void testOne(){
        System.out.println("TEST 1");
    }

    @Disabled("Wyłączyłem bo musiałem!")
    @Test
    @DisplayName("Test with display name and special char  \uD83D\uDC80")
    void testWithDisplayNameAndSpecialChar(){
        System.out.println("TEST 2");
    }

    @AfterEach
    void teardown(){
        System.out.println("Sprzątanie po KAŻDYM teście w klasie");
    }

    @AfterAll
    static void teardownAll(){
        System.out.println("Sprzątanie po WSZYSTKICH testach w klasie");
    }
}
