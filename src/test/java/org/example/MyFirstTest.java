package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyFirstTest {

    @RepeatedTest(value = 3, name = "{displayName} {currentRepetition} / {totalRepetitions}")
    @DisplayName("To jest test potwierdzający")
    void myFirstTest(){
        String message = "2+2 powinno dać 4";
//        System.out.println(message);
        assertEquals(4,2 + 2,message);
    }
}
