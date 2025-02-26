import com.thoughtworks.qdox.model.expression.Add;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupedAssertionsTest {

    @Test
    void groupedAssertionsAddressTest(){
//        Given&When
        Address address = new Address("John","Kowalski");
//        Then
        assertAll("address",
                ()-> assertEquals("John",address.getFirstName()),
                ()-> assertEquals("Kowalski", address.getLastName())
                );
    }

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
