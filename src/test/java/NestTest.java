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
            assertEquals(5, kalkulator.dodaj(2,3));
        }
        @Test
        void dodawanieUjemneTest(){
            assertEquals(-5, kalkulator.dodaj(-2,-3));
        }
        @Nested
        class OdejmowanieTest {
            @Test
            void odejmowanieDodatnieTest(){
                assertEquals(1, kalkulator.odejmij(4,3));
            }
            @Test
            void odejmowanieUjemneTest(){
                assertEquals(-1, kalkulator.odejmij(-4,-3));
            }
        }
    }
}
