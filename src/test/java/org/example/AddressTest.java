package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AddressTest {

    @Test
    void shouldThrowExceptionWhenFirstNameIsNullTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->
                new Address(null,"Kowalski"));
        assertEquals("First name cannot be null", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenLastNameIsNullTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->
                new Address("John",null));
        assertEquals("Last name cannot be null", exception.getMessage());
    }
}
