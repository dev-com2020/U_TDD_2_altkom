package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// zła praktyka

public class InterdependenceTest {
    static int sharedCounter = 0;

    @Test
    void testA(){
        sharedCounter = 5;
    }

    @Test
    void testB() {
        assertEquals(5, sharedCounter);
    }

//    staramy się nazywać przekazywane parametry
    @Test
    void shouldCalculateCorrectPrice(){
        assertEquals(99.99,calculatePrice(5,19.99));
    }

    @Test
    void shouldReturnCorrectValue(){
        assertTrue(calculate(2,3) == 5);
    }

    private int calculate(int i, int i1) {
        return i + i1;
    }

    //    tak powinno działać ok!
    @Test
    void testC() {
        int localCounter = 5;
        assertEquals(5, localCounter);
    }
    @Test
    void shouldCalculateCorrectPrice_2(){
        double item_price = 19.99;
        int item_quantity = 5;
        double expectedPrice = item_price * item_quantity;
        assertEquals(expectedPrice,calculatePrice(item_quantity, item_price));
    }
    @Test
    void shouldReturnCorrectValue_2(){
        assertEquals(5,calculate(2,3));
    }


    private double calculatePrice(int itemQuantity, double itemPrice) {
        return itemPrice;
    }
}
