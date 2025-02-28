package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTest {
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void shouldRunOnlyWinTest(){
        assertTrue(System.getProperty("os.name").toLowerCase().contains("win"));
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void shouldRunOnlyLinuxTest(){
        assertTrue(System.getProperty("os.name").toLowerCase().contains("linux"));
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void shouldRunOnlyOnJava17Test(){
        assertEquals(17,Runtime.version().feature());
    }

    @Test
    @EnabledIfSystemProperty(named = "user.language", matches = "pl")
    void shouldRunOnlyIfLangIsPolishTest(){
        assertEquals("pl", System.getProperty("user.language"));
    }
}
