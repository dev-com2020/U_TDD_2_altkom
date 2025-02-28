package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;

public class TestReporterTest {

    @Test
    void reportSingleValue(TestReporter testReporter){
        testReporter.publishEntry("key","value");
        int result = 2 + 3;
        testReporter.publishEntry("Oblczenia", String.valueOf(result));
    }

    @Test
    void reportSeveralValues(TestReporter testReporter){
        HashMap<String, String> values = new HashMap<>();
        values.put("name", "Jan");
        values.put("surname", "Kowalski");
        testReporter.publishEntry(values);
    }
}
