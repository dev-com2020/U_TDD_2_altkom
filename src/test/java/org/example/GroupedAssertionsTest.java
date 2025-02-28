package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupedAssertionsTest {

    @Test
    void groupedAssertionsAddressTest(){
//        Given&When
        Address address = new Address("John","Kowalski");
//        Then
        assertAll("address",
                ()-> Assertions.assertEquals("John",address.getFirstName()),
                ()-> Assertions.assertEquals("Kowalski", address.getLastName())
                );
    }

    @Disabled("shouldHandleNullValues nie spełnia warunków logiki biznesowej")
    @Test
    void shouldHandleNullValues(){
//        Given&When
        Address address = new Address("null",null);
//        Then
        assertNotNull(address.getFirstName());
        assertNull(address.getLastName());
    }

    @Test
    void shouldThrowExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            throw new IllegalArgumentException("Nieprawidłowy argument");
        });
        assertEquals("Nieprawidłowy argument", exception.getMessage());
    }
}
