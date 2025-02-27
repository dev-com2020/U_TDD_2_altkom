import com.thoughtworks.qdox.model.expression.Add;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAssertTest {

    @Test
    void testWithJunit5(){
        assertEquals(5,2+3);
    }

    @Test
    void testWithAssertJ(){
        assertThat(2 + 3).isEqualTo(5);
    }

    @Test
    void shouldContainElements(){
        List<String> names = List.of("Tomasz","Alicja","Bob");

        assertThat(names)
                .hasSize(3)
                .contains("Tomasz")
                .doesNotContain("Dawid");
    }
    @Test
    void shouldCorrectOrder(){
        List<Integer> numbers = List.of(1,2,3,4);

        assertThat(numbers)
                .containsExactly(1,2,3,4);
    }
    @Test
    void shouldThrowExcWithAssertJ(){
        assertThatThrownBy(()-> {
            throw new IllegalArgumentException("Niepoprawny");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Niepoprawny");
    }

    @Test
    void shouldContainSubString(){
        String message = "Witaj, AssertJ jest spoko";

        assertThat(message)
                .startsWith("Witaj")
                .contains("AssertJ")
                .endsWith("spoko")
                .isNotEmpty();
    }

    @Test
    void shouldHaveCorrectAddress(){
        Address user = new Address("Tomasz","Kowalski");

        assertThat(user)
                .extracting(Address::getFirstName,Address::getLastName)
                .containsExactly("Tomasz","Kowalski");

        assertThat(user.getFirstName()).startsWith("T");
    }

    @Test
    void shouldCheckNumbers(){
        assertThat(10)
                .isGreaterThan(5)
                .isLessThanOrEqualTo(10)
                .isBetween(1,20);
    }
}
