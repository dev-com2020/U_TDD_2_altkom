package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestTest {
    private Kalkulator kalkulator;

    @BeforeEach
    void setup(){
        kalkulator = new Kalkulator();
        System.out.println("SETUP!");
    }

    @Nested
    class DodawanieTest {
        @Test
        void dodawanieDodatnieTest(){
            Assertions.assertEquals(5, kalkulator.dodaj(2,3));
        }
        @Test
        void dodawanieUjemneTest(){
            Assertions.assertEquals(-5, kalkulator.dodaj(-2,-3));
        }
        @Nested
        class OdejmowanieTest {
            @Test
            void odejmowanieDodatnieTest(){
                Assertions.assertEquals(1, kalkulator.odejmij(4,3));
            }
            @Test
            void odejmowanieUjemneTest(){
                Assertions.assertEquals(-1, kalkulator.odejmij(-4,-3));
            }
        }
    }
}
