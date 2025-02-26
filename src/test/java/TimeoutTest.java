import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@Tag("slow")
public class TimeoutTest {

    @Test
    @Tag("unit")
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofMinutes(2),()-> {
//            tutaj kod do wykonania
        });
    }
    @Test
    void timeoutExceeded(){
        assertTimeout(Duration.ofMillis(10),()-> {
            Thread.sleep(12);
        });
    }
    @Test
    @Tags({@Tag("unit"), @Tag("important")})
    void timeoutNotExceededWithMethod(){
        String actualGreeting = assertTimeout(Duration.ofMinutes(1),
                TimeoutTest::greeting);
        assertEquals("Witaj",actualGreeting);
    }

    private static String greeting() {
        return "Witaj";
    }
}
